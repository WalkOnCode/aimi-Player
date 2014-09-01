package com.imi.uku.bean;

import java.util.Arrays;

public class PlayPageListVideoInfo {
	private int show_videostage;
	private String img;
	private String title;
	private  String videoid;
	private boolean is_new;
	private String[] streamtypes;
	private int show_videoseq;
	private String cats;
	private int limit ;
	public int getShow_videostage() {
		return show_videostage;
	}
	public void setShow_videostage(int show_videostage) {
		this.show_videostage = show_videostage;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVideoid() {
		return videoid;
	}
	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}
	public boolean isIs_new() {
		return is_new;
	}
	public void setIs_new(boolean is_new) {
		this.is_new = is_new;
	}
	public String[] getStreamtypes() {
		return streamtypes;
	}
	public void setStreamtypes(String[] streamtypes) {
		this.streamtypes = streamtypes;
	}
	public int getShow_videoseq() {
		return show_videoseq;
	}
	public void setShow_videoseq(int show_videoseq) {
		this.show_videoseq = show_videoseq;
	}
	public String getCats() {
		return cats;
	}
	public void setCats(String cats) {
		this.cats = cats;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public PlayPageListVideoInfo(int show_videostage, String img, String title,
			String videoid, boolean is_new, String[] streamtypes,
			int show_videoseq, String cats, int limit) {
		super();
		this.show_videostage = show_videostage;
		this.img = img;
		this.title = title;
		this.videoid = videoid;
		this.is_new = is_new;
		this.streamtypes = streamtypes;
		this.show_videoseq = show_videoseq;
		this.cats = cats;
		this.limit = limit;
	}
	public PlayPageListVideoInfo() {
		super();
		// TODO �Զ���ɵĹ��캯����
	}
	@Override
	public String toString() {
		return "PlayPageListVideoInfo [show_videostage=" + show_videostage
				+ ", img=" + img + ", title=" + title + ", videoid=" + videoid
				+ ", is_new=" + is_new + ", streamtypes="
				+ Arrays.toString(streamtypes) + ", show_videoseq="
				+ show_videoseq + ", cats=" + cats + ", limit=" + limit + "]";
	}
	
}
