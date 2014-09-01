package com.imi.uku.bean;

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
		// TODO �Զ���ɵĹ��캯����
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
