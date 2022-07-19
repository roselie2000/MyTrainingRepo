package com.chainsys.assignment2;

public class HospitalClass {
	public void hospital(String hospitalname, String founder) {
		System.out.println("Hospital Name :" + hospitalname);
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
