package com.imi.uku;

import java.util.List;

import org.apache.http.Header;

import com.google.gson.Gson;
import com.imi.uku.bean.Data;
import com.imi.uku.bean.PlayAnalysis;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
/**
 * 视频地址工具类
 * @author xyzj9_000
 *
 */
public class VideoUtils {
	static PlayAnalysis jsons = null;
	/**
	 * 返回真实的视频播放地址
	 * @param ids 视频ID
	 * @return
	 */
	public static String getVideoUrl(String ids){
		PlayAnalysis pa = analysis("http://v.youku.com/player/getPlayList/VideoIDS/"+ids);
		
		if(pa!= null){
			List<Data> data = (List<Data>)pa.getData();
			 String s = getFileID(data.get(0).getStreamfileids().getMp4(),data.get(0).getSeed());
			 System.out.println("http://k.youku.com/player/getFlvPath/sid/64093166358792264dcc4_02/st/mp4/fileid/"+s);
			 return "http://k.youku.com/player/getFlvPath/sid/64093166358792264dcc4_02/st/mp4/fileid/"+s;
		}
		return null;			
		

	}
	
	/**
	 * 生成优酷视频地址算法
	 * @param fileid
	 * @param seed
	 * @return
	 */
	private static String getFileID(String fileid,double seed){  
		  String mixed = getFileIDMixString(seed);  
		  String[] ids= fileid.split("\\*");  
		  StringBuilder realId = new StringBuilder();  
		  int idx;  
		  for (int i=0; i< ids.length; i++){  
		    idx = Integer.parseInt(ids[i]);  
		    realId.append(mixed.charAt(idx));  
		  }  
		  return realId.toString();  
		}  
		  
		private static String getFileIDMixString(double seed){  
		  StringBuilder mixed = new StringBuilder();  
		  StringBuilder source = new StringBuilder(  
		    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/\\:._-1234567890");  
		  int index, len = source.length();  
		  for (int i=0; i< len;++i){  
		    seed = (seed * 211 + 30031) % 65536;  
		    index = (int)Math.floor(seed/65536 * source.length());  
		    mixed.append(source.charAt(index));  
		    source.deleteCharAt(index);  
		  }  
		  return mixed.toString();  
		} 
	
	/**
	 * 根据URL获取JSON
	 * @param utl 
	 * @return
	 */
	public static PlayAnalysis analysis(String url){
		HttpUtils http = new HttpUtils();
		http.send(HttpMethod.GET, url, new RequestCallBack<String>() {

			@Override
			public void onFailure(HttpException arg0, String arg1) {

			}

			@Override
			public void onSuccess(ResponseInfo<String> responseInfo) {

				String s = new String(responseInfo.result);
				Gson gson = new Gson();
				jsons = gson.fromJson(s, PlayAnalysis.class);
			}
		});
		return jsons;
	}
}
