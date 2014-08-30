package com.imi.ukubean;

public class PlayAnalysis {
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public PlayAnalysis(Data data) {
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
