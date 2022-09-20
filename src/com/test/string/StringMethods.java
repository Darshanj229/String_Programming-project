package com.test.string;

public class StringMethods {

	

			public static void main(String[] args) {
				
				
				

		String st=new String("Welcome to Java String programming");
				
				System.out.println(st.length());
				System.out.println(st.charAt(0));
				System.out.println(st.contains("c++"));
				
				st=st.concat(" at Edubridge");
				System.out.println(st.concat(" at Edubridge"));
				System.out.println(st);
				System.out.println(st.replace("Java", "C"));


	}

}
