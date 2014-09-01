package com.imi.uku.bean;

public class VideoListInfo {
	
	private String showid;
	private String subtitle;
	private String thumb;
	private String title;
	public String getShowid() {
		return showid;
	}
	public void setShowid(String showid) {
		this.showid = showid;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public VideoListInfo() {
		super();
		// TODO �Զ���ɵĹ��캯����
	}
	public VideoListInfo(String showid, String subtitle, String thumb,
			String title) {
		super();
		this.showid = showid;
		this.subtitle = subtitle;
		this.thumb = thumb;
		this.title = title;
	}
	@Override
	public String toString() {
		return "VideolistInfo [showid=" + showid + ", subtitle=" + subtitle
				+ ", thumb=" + thumb + ", title=" + title + "]";
	}
	
}
