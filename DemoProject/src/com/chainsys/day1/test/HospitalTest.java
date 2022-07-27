package com.chainsys.day1.test;

import com.chainsys.day1.assignment1.HospitalClass;

public class HospitalTest {

	public static void main(String[] args) {
		HospitalClass h=new HospitalClass();
		h.hospitalName = "Apollo";
		h.chiefDoctor="Latha Devi";
		h.founder = "Prathab C Reddy";
		h.speciality="Organ Transplantation";
		h.address="Chennai";
		System.out.println("amountForAppointment :"+h.hospitalName);
		System.out.println("doctorName :"+h.chiefDoctor);
		System.out.println("hospitalName :"+h.founder);
		System.out.println("location :"+h.address);
		System.out.println("speciality :"+h.speciality);

	}

}
