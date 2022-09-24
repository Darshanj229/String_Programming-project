package com.test.string;

public class StringDemo {

	public static void main(String[] args) {
		 String st=new String("Java programming");
	        //System.out.println(st.replace("Java","c++"));//st is unchanged
	        st=st.replace("Java","c++");//st is changed
	        System.out.println(st);
	        
	        
	        String st1=new String("Java programming");
	        System.out.println(st1.concat(" in 2022."));//st1 will remain unchanged
	        st1=st1.concat(" in 2022.");
	        System.out.println(st1);
	        
	        String st3="Java programming";
	        System.out.println(st3.concat(" in 2022."));
	        System.out.println(st3);

	}

}
