package com.test.string;

public class StringMethods {

	

			public static void main(String[] args) {
				  String st=new String("Welcome to Java String programming");
			        String st1=new String("Welcome to Java String programming");
			        System.out.println(st.length());
			        System.out.println(st.charAt(0));
			        System.out.println(st.contains("c++"));
			                                       //Welcome to Java String programming
			        st=st.concat(" at Edubridge"); //Welcome to Java String programming at Edubridge
			        System.out.println(st);
			        System.out.println(st.concat(" at Edubridge")); //Welcome to Java String programming at Edubridge at Edubridge
			        st=st.concat(" at Edubridge");
			        System.out.println(st);//Welcome to Java String programming at Edubridge st Edubridge
			        st=st.replace("Java", "C");
			        System.out.println(st);
			        System.out.println(st);
			        
			      System.out.println(st1);
			      int counter = 1;
			     int length = st1.length();
				for(int i = 0;i<length;i++) {
					if(st1.charAt(i) != ' '){
						
				counter = counter + 1;
					}
				}
				System.out.println("The String contains " + counter + "words");
				

	}

}
