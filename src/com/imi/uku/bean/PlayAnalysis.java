package com.imi.uku.bean;

import java.util.List;

public class PlayAnalysis {
	private List<Data> data;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public PlayAnalysis(List<Data> data) {
		super();
		this.data = data;
	}

	public PlayAnalysis() {
		super();
	}

	@Override
	public String toString() {
		return "PlayAnalysis [data=" + data + "]";
	}
	
}
