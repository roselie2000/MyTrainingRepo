package com.chainsys.day8.test;

import com.chainsys.day8.UserDefinedException;

public class UserDefinedExceptionTest {

	public static void main(String args[]) {
		int n = 0;
		try {
			if(n == 0) {
				throw new UserDefinedException("Value Exception");
			}
		}
		catch(UserDefinedException e) {
			e.printStackTrace();
		}
	}
}
