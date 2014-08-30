package com.imi.ukubean;

import java.util.List;

public class VideoList {
	private String status;
	private String pz;
	private int total;
	private String pg;
	private List<VideoListInfo> results ;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPz() {
		return pz;
	}
	public void setPz(String pz) {
		this.pz = pz;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getPg() {
		return pg;
	}
	public void setPg(String pg) {
		this.pg = pg;
	}
	public List<VideoListInfo> getResults() {
		return results;
	}
	public void setResults(List<VideoListInfo> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "VideoList [status=" + status + ", pz=" + pz + ", total="
				+ total + ", pg=" + pg + ", results=" + results + "]";
	}
	public VideoList(String status, String pz, int total, String pg,
			List<VideoListInfo> results) {
		super();
		this.status = status;
		this.pz = pz;
		this.total = total;
		this.pg = pg;
		this.results = results;
	}
	public VideoList() {
		super();
	}
	
}
