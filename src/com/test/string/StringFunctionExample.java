package com.test.string;

public class StringFunctionExample {

	public static void main(String[] args) {
		 String st="We,love,Java,programming,We";
	        System.out.println(st.charAt(0));
	        System.out.println(st.charAt(1));
	        
	        //int ar[]=new int[12];
	        //String st3[]=new String[12];
	        
	        
	        System.out.println(st.length());
	        System.out.println(st.charAt(0));
	        System.out.println(st.toLowerCase());
	        System.out.println(st.toUpperCase());
	        System.out.println(st.substring(4,7));
	        System.out.println(st.indexOf("love",2));
	        System.out.println(st.lastIndexOf('a',13));
	        System.out.println(st.replace('l', 'L'));
	        System.out.println(st.replace("love", "LiKe"));
	        System.out.println(st.replaceAll("We", "I"));
	        
	        String st1[]=st.split("v");
	        System.out.println(st1);
	        System.out.println(st.trim());
	        System.out.println(st1[0]);
	        System.out.println(st1[1]);
	        System.out.println(st1[2]);
	        
	        

	}

}
