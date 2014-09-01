package com.imi.player;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.imi.uku.Uku;
import com.imi.uku.bean.PlayPageDetails;

public class MainActivity extends Activity {
	
	
	PlayPageDetails p ;
	private TextView tv1,tv2,tv3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void listClick(View v){
		
		
	}
	
	private Handler mHandler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case 1:
				System.out.println("messge 1");
				break;
			case 2:
				System.out.println(msg.obj.toString());
				tv2.setText(msg.obj.toString());
				p= (PlayPageDetails)msg.obj;
				
				tv2.setText(p.getDetail().getVideoid());
				
				break;
			default:
				break;
			}
			
		}
	};
	
	public void detailClick(View v){
		
//		uku.getDetail("ad6e946aa50911df97c0",mHandler);
		
		Uku u = new Uku();
//		u.getVideoList("96", 1, mHandler, 1);
		u.getDetail("ad6e946aa50911df97c0",mHandler, 2);
		
	}
	public void realClick(View v){
		
		Uku u = new Uku();
		
		tv2.setText(u.getRealUrl(p.getDetail()));
	}
	

}
