package com.xworkz.aptitude.assignment4;

public class ReversingTheWord {
	public static void main(String[] args) {
		String s = "Rakshitha";
		char[] ch = s.toCharArray();
		String s1 =""; 

		for (int i = ch.length - 1; i >= 0; i--)
		{
			s1 +=ch[i];
		}
			System.out.print(s1);
		

	}
}
