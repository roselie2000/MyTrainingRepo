package com.chainsys.assignment2;

public class HospitalClass {
	
	//Get Hospital name and Founder of the Hospital
	public void hospital(String hospitalName, String founder) {
		System.out.println("Hospital Name :" + hospitalName);
		System.out.println("Hospital Founder Name :" + founder);
	}

	//Get Chief Doctor name
	public String chief() {
		String cdoctor = "Doctor. Latha Devi";
		return cdoctor;
	}
	
	//Get Specialty of Doctor 
	public void special() {
		String spec = "Organ Transplantation";
		System.out.println("Speciality :" + spec);
	}
	
	//Get Address of the Hospital 
	public String address(String name) {
		String addr = "Chennai";
		return addr;
		
	}
}
