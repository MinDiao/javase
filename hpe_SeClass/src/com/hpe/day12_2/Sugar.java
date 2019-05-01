package com.hpe.day12_2;

public class Sugar extends Water implements Buffer, Filtration, Hot {

	@Override
	public void jr() {
		System.out.println("加热");
	}
	
	@Override
	public void gl() {
		System.out.println("过滤");
	}

	@Override
	public void hc() {
		System.out.println("缓冲");
	}

	@Override
	public void cs() {
		System.out.println("抽水");
	}
	
	public void ft() {
		System.out.println("放糖");
	}

}
