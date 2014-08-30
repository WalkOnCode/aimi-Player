package com.imi.ukubean;

public class Data {
	
	private  double seed ;
	private Streamfileids streamfileids;
	public double getSeed() {
		return seed;
	}
	public void setSeed(double seed) {
		this.seed = seed;
	}
	public Streamfileids getStreamfileids() {
		return streamfileids;
	}
	public void setStreamfileids(Streamfileids streamfileids) {
		this.streamfileids = streamfileids;
	}
	public Data() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Data(double seed, Streamfileids streamfileids) {
		super();
		this.seed = seed;
		this.streamfileids = streamfileids;
	}
	@Override
	public String toString() {
		return "Data [seed=" + seed + ", streamfileids=" + streamfileids + "]";
	}
	


}
