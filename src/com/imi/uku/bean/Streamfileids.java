package com.imi.uku.bean;

public class Streamfileids {
	private String flv ;
	private String mp4 ;
	private String hd2 ;
	public String getFlv() {
		return flv;
	}
	public void setFlv(String flv) {
		this.flv = flv;
	}
	public String getMp4() {
		return mp4;
	}
	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}
	public String getHd2() {
		return hd2;
	}
	public void setHd2(String hd2) {
		this.hd2 = hd2;
	}
	public Streamfileids(String flv, String mp4, String hd2) {
		super();
		this.flv = flv;
		this.mp4 = mp4;
		this.hd2 = hd2;
	}
	public Streamfileids() {
		super();
	}
	@Override
	public String toString() {
		return "Streamfileids [flv=" + flv + ", mp4=" + mp4 + ", hd2=" + hd2
				+ "]";
	}

}
