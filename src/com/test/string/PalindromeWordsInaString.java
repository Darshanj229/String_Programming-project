package com.test.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeWordsInaString {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string :");
        String st=br.readLine();
        String reverse="";
         // Madam
        int count = 0;
        int i =0;
       
        for(i=st.length()-1;i>=0;i--) {
 	    	
       	 st=st.toLowerCase();
 			 reverse = reverse + st.charAt(i);
       }
        
      
        
        for(i = 0;i<st.length();i++ ) {
        	
        	 
           
        	 
        	 if(st == reverse){
        		 count+=1;
        	 }
        }
        	 System.out.println(count);
        	
       
       
        
	}
}