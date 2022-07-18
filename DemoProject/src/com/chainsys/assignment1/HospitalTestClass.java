package com.chainsys.assignment1;

public class HospitalTestClass {

	public static void main(String[] args) {
		HospitalClass hc = new HospitalClass();
		hc.hospitalName = "Apollo Hospital";
		hc.hospitalFounder = "Prathap C. Reddy";
		hc.special = "Organ Transplantation";
		hc.chiefDoctor = "Doctor Latha Devi";
		hc.address = "Chennai";
		System.out.println(hc.hospitalName);
		System.out.println(hc.hospitalFounder);
		System.out.println(hc.chiefDoctor);
		System.out.println(hc.special);
		System.out.println(hc.address);

	}

}
