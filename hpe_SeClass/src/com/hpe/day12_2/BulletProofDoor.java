package com.hpe.day12_2;

public class BulletProofDoor extends Door implements BulletSafe {

	@Override
	public void bulletProof() {
		System.out.println("防弹门");
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
