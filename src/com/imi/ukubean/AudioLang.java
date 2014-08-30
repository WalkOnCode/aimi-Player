package com.imi.ukubean;

public class AudioLang {
	private String lang;
	private String langcode;
	private String vid;
	private int langid;
	
	public int getLangid() {
		return langid;
	}
	public void setLangid(int langid) {
		this.langid = langid;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLangcode() {
		return langcode;
	}
	public void setLangcode(String langcode) {
		this.langcode = langcode;
	}
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public AudioLang(String lang, String langcode, String vid) {
		super();
		this.lang = lang;
		this.langcode = langcode;
		this.vid = vid;
	}
	
	@Override
	public String toString() {
		return "AudioLang [lang=" + lang + ", langcode=" + langcode + ", vid="
				+ vid + ", langid=" + langid + "]";
	}
	public AudioLang() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}
