package com.hpe.day12_2;

public class DoorTest {

	public static void main(String[] args) {
		FireProofDoor fpd = new FireProofDoor();
		fpd.fireProof();
		fpd.open();
		fpd.close();
		
		BulletProofDoor bp = new BulletProofDoor();
		bp.bulletProof();
		bp.open();
		bp.close();
	}
	
}
