package com.hpe.day12_2;

public class FireProofDoor extends Door implements FireSafe {

	@Override
	public void fireProof() {
		System.out.println("防火门");
	}

	@Override
	public void open() {
		System.out.println("门开了");
	}

	@Override
	public void close() {
		System.out.println("门关了");
	}

}
