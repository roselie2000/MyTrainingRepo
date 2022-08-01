package TestAssgnPackage.test;

import TestAssgnPackage.interfacedemo.MultiInterface;

public class MainInterfClass {
		public static void main(String args[]) {
			MultiInterface mit = new MultiInterface();
			mit.add();//call method of interface1 
			mit.subtract();//call method of interface2
			mit.multiple();//call method of multiInterface class
		}
}
