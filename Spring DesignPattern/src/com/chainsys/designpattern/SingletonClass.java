package com.chainsys.designpattern;

public class SingletonClass {	
	  // public instance initialized when loading the class
	  private static final SingletonClass instance = new SingletonClass();
	  String msg = "This is singleton Class. The Object is created at only one time";
	  private SingletonClass()
	  {
	    // private constructor
	  }
	  public static SingletonClass getInstance(){
	        return instance;
	}
}
