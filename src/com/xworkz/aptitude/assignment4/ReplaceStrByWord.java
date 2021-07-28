package com.xworkz.aptitude.assignment4;

public class ReplaceStrByWord {

	public static void main(String[] args) {
		String s="My name is Ricky"; 
		System.out.println("before replacing: " +s);
		
		String replaceString=s.replaceAll("Ricky","Rakshitha");
		System.out.println("After replacing: " +replaceString);  
	}

}
