package com.imi.uku;

import android.os.Handler;
import android.os.Message;

import com.google.gson.Gson;
import com.imi.uku.bean.PlayPageDetails;
import com.imi.uku.bean.VideoDetail;
import com.imi.uku.bean.VideoList;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

/**
 * 优酷API
 * 
 * @author Administrator
 * 
 */
public class Uku {
	public static final String API_VIDEOlIST = "http://api.3g.youku.com/layout/phone3_0/channels?pid=ad00404c17cb662e&pz=20&ob=2&filter=&image_hd=0&guid=65f01cd0078fa94441ff9a0d02ce864a&ver=3.5&network=WIFI&os=WindowsPhone&os_ver=8.10.12397.0&brand=NOKIA&btype=RM-822_apac_prc_204";
	
	public static final String API_DETAIL ="http://api.3g.youku.com/layout/ios3_0/play/detail?pid=ad00404c17cb662e&guid=65f01cd0078fa94441ff9a0d02ce864a&ver=3.5&network=WIFI&os=WindowsPhone&os_ver=8.10.12397.0&brand=NOKIA&btype=RM-822_apac_prc_204";
	
	/**
	 * 根据参数获取视频列表
	 * 在频道分类中固定 cid <br>
	 * 在handle中根据消息what来处理
	 * msg附带obj为VideoList对象
	 * 
	 * @param cid 栏目ID  
	 * @param pg 分页,后面的数是当前页码
	 * @param handler
	 * @param what 消息id
	 * 
	 * @author WalkOncode
	 */
	public void getVideoList(String cid, int pg, Handler handler, int what ){
		String url = API_VIDEOlIST +"&pg=" +pg+ "&cid=" +cid;
		getData(url, handler, what, VideoList.class);
	}
	
	/**
	 * 获取视频详细信息
	 * 
	 * 在handle中，msg附带obj为PlayPageDetails对象<br>
	 * PlayPageDetails.getDetail()可获取视频详细信息VideoDetail
	 * 
	 * @param showid 视频showid
	 * @param handler
	 * @param what 消息id
	 */
	public void getDetail(String showid,final Handler handler, int what){
		String url = API_DETAIL + "&id="+showid;
		getData(url, handler, what, PlayPageDetails.class);
	}
	
	/**
	 * 根据VideoDetail获得真实视频播放地址
	 * @param videoDetail
	 * @return
	 */
	public String getRealUrl(VideoDetail videoDetail) {
		String videoid = videoDetail.getVideoid();
		String realUrl = VideoUtils.getVideoUrl(videoid);
		if (realUrl != null) {
			return realUrl;
		} else {
//			getRealUrl(videoDetail);
		}
		return null;
	}
	
	private <T> void getData(String url, final Handler mHandler, final int flag,
			final Class<T> clazz) {

		HttpUtils http = new HttpUtils();
		http.send(HttpMethod.GET, url, new RequestCallBack<String>() {
			
			private T tData;

			@Override
			public void onFailure(HttpException arg0, String arg1) {
			}

			@Override
			public void onSuccess(ResponseInfo<String> responseInfo) {

				String s = new String(responseInfo.result);
				Gson gson = new Gson();
				tData = gson.fromJson(s, clazz);
				Message m = mHandler.obtainMessage(flag, tData);
				mHandler.sendMessage(m);
			}
		});
	}
}
