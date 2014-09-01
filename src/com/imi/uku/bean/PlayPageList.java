package com.imi.uku.bean;

import java.util.List;

public class PlayPageList {
	private String showcats;
	private String status ;
	private boolean show_update;
	private int  pg;
	private int  pz;
	private int  total;
	private List<PlayPageListVideoInfo> results;
	public String getShowcats() {
		return showcats;
	}
	public void setShowcats(String showcats) {
		this.showcats = showcats;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isShow_update() {
		return show_update;
	}
	public void setShow_update(boolean show_update) {
		this.show_update = show_update;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getPz() {
		return pz;
	}
	public void setPz(int pz) {
		this.pz = pz;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<PlayPageListVideoInfo> getResults() {
		return results;
	}
	public void setResults(List<PlayPageListVideoInfo> results) {
		this.results = results;
	}
	public PlayPageList(String showcats, String status, boolean show_update,
			int pg, int pz, int total, List<PlayPageListVideoInfo> results) {
		super();
		this.showcats = showcats;
		this.status = status;
		this.show_update = show_update;
		this.pg = pg;
		this.pz = pz;
		this.total = total;
		this.results = results;
	}
	public PlayPageList() {
		super();
		// TODO �Զ���ɵĹ��캯����
	}
	@Override
	public String toString() {
		return "PlayPageList [showcats=" + showcats + ", status=" + status
				+ ", show_update=" + show_update + ", pg=" + pg + ", pz=" + pz
				+ ", total=" + total + ", results=" + results + "]";
	}
	
}
