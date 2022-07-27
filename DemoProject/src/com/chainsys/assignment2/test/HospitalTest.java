package com.chainsys.assignment2.test;

import com.chainsys.assignment2.HospitalClass;

public class HospitalTest {
		public static void main(String[] args) {
			HospitalClass hc = new HospitalClass(); //Creating Object for HospitalClass Class
			hc.hospital("Apollo", "Prathab C Reddy"); // Calling hospital method
			hc.chief(); //Calling chief method
			hc.special();//Calling special method
			System.out.println("Address :" + hc.address("Apollo"));//Calling address method
		}
}
