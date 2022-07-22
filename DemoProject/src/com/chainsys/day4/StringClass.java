package com.chainsys.day4;

public class StringClass {
	public static void main(String args []) {
		String name = "Axlex";
		String name2 = "Bobs";
		String name3 = "Alex";
		String name4 = " ";
		
		//charAt(index) - return the character of the respective index
		System.out.println("The char in the given index");
		System.out.println(name.charAt(0));
		System.out.println("****************************************************");
		
		//codePointAt(index) - return the unicode of the respective index
		System.out.println("The unicode value of the char in the given index");
		System.out.println(name.codePointAt(3));
		System.out.println("****************************************************");
		
		/*contains(char) - return true: the specified char is present in the string.
		 * false: the the specified char is present in the string*/
		System.out.println("whether the given char is present in the string");
		System.out.println(name.contains("R"));
		System.out.println("****************************************************");
		
		//concat(string) - concate two string
		System.out.println("Concatination of two strings");
		System.out.println(name.concat(name2));
		System.out.println("****************************************************");
		
		//endsWith(string) - return true if the give string is present at the end of the string otherwise false
		System.out.println("whether the string is ends with the given string");
		System.out.println(name.endsWith("ex"));
		System.out.println("****************************************************");
		
		//contentEquals(string) - return true if the content present in the string otherwise false
		System.out.println("whether the given string is appear in the string in the same order ");
		System.out.println(name.contentEquals("Au"));
		System.out.println("****************************************************");
		
		//equals(string) - compare two string whether it is same or not
		System.out.println("comparition of two string");
		System.out.println(name.equals(name3));
		System.out.println("****************************************************");
		
		//indent(int) - give specified number of indentation infront of the string
		System.out.println("string with indentation");
		System.out.println(name.indent(3));
		System.out.println("****************************************************");
		
		//indexOf - return the index value of the given char or string
		System.out.println("The index value of the given string or char");
		System.out.println(name.indexOf("e"));
		System.out.println(name.indexOf("ex"));
		System.out.println("****************************************************");
		
		//isBlank() - return true if the string is blank(not have any char or spaces)
		System.out.println("check Whether the given string is blank");
		System.out.println(name4.isBlank());
		System.out.println("****************************************************");
		
		//isEmpty() - return true if the string is empty(not have any char) if it have space then return false
		System.out.println("check whether the string is empty");
		System.out.println("");
		System.out.println(name4.isEmpty());
		System.out.println("****************************************************");
		
		//lastIndexOf(char) - if a char appear no. of times then it returns the index of last appearance of the char.
		System.out.println("The last index of the given string.");
		System.out.println(name.lastIndexOf("x"));
		System.out.println("****************************************************");
		
		//length() - return the length of the give string
		System.out.println("The length of the string");
		System.out.println(name.length());
		System.out.println("****************************************************");
		
		//replace(char, char) - replace the a char with another char in the string.
		System.out.println("Replace");
		System.out.println(name.replace("e", "a"));
		System.out.println(name);
	}
}
