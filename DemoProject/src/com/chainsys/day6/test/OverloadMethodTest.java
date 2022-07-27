package com.chainsys.day6.test;

import com.chainsys.day6.OverloadMethodClass;

public class OverloadMethodTest {

	public static void main(String args[]) {
		OverloadMethodClass om = new OverloadMethodClass();//Object creation
		om.display('a', 1);//method calling
		om.display(1, 'a');//method calling
	}
}
