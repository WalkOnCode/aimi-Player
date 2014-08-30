package com.imi.ukubean;

public class PlayPageDetails {
	private String status;
	private VideoDetail detail;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public VideoDetail getDetail() {
		return detail;
	}
	public void setDetail(VideoDetail detail) {
		this.detail = detail;
	}
	public PlayPageDetails() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public PlayPageDetails(String status, VideoDetail detail) {
		super();
		this.status = status;
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "PlayPageDetails [status=" + status + ", detail=" + detail + "]";
	}
	
}
