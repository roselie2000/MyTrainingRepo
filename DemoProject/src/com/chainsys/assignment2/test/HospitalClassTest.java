package com.chainsys.assignment2.test;

import com.chainsys.assignment2.HospitalClass;

public class HospitalClassTest {
	public static void main(String[] args) {
		HospitalClass hc = new HospitalClass();
		hc.hospital("Apollo", "Prathab C Reddy");
		hc.chief();
		hc.special();
		System.out.println("Address :" + hc.address("Apollo"));
	}
}
