package com.test.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	      System.out.println("Enter a given String : ");
	      String str = br.readLine();
	      String rev="";
	      int i = 0;
	     
	    	for(i=str.length()-1;i>=0;i--) {
	    	
	    		
	    				 rev = rev + str.charAt(i);
	   
	    		}
                if(str.equals(rev)) {
                	System.out.println("Palindrome String");
                }
                else
                {
                	System.out.println("Non Palindrome string");
                }
	}}