package stringTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test {

	public static void main(String[] args) {
		
		String s = new String ();
		String s2 = new String ("ahmed");
		String s3 = new String (s2);
		char [] arr = {'a', 'b', 'c'};
		String s4 = new String (arr);
		System.out.printf("%s \t %s \t %s \t %s \t",s, s2, s3, s4);
		
		
		 String s5 = "java";
		String s6 = "java";
	String s7 = "world";
		String S8 = s6 + s7;
		String S9 = s6 += s7;
		 String S10 = s6.concat(s7);
		
		if (s5 == s6) {
			// compire references
		}
		if (s5.equals(s6)) {
			// compire objects
		}
		
		 //String Methods....
		String s1 = " hello java";
		int x = s.length();
		System.out.println(x);
		s.charAt(2);
		System.out.println(s.charAt(5));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.codePointAt(8));
		System.out.println(s.endsWith("va"));
		System.out.println(s.contains("h"));
		System.out.println(s.isEmpty());
		System.out.println(s.substring(2, 9));
		
	// Strings from Primitives
		int x1 = 10 ; 
		String s12 = String.valueOf(x1);
		System.out.println(s12);
		
		//StringBuilder and StringBuffer Classes
		 String s11 = new String ("ahmed");
		
		StringBuilder sb = new StringBuilder(s11);
		sb.append(" ali");
		sb.reverse();
		s11 = sb.toString();
		System.out.println(s11);
		
		 
		 // Wrapper Classes
		 int x11 = 12;
		 Integer myInt = new Integer(x11); // Boxing
		 
		 // ==========================================================
		 Float myFloat = new Float (21.5);
		 float f = myFloat.floatValue(); // un-boxig
		 //============================================================
		 
		 int y = 12;
		 Integer myInt2 = y;  // auto Boxing
		 //=======================================================0000000
		 Float myFloat2 = new Float (21.5);
		 float f2 = myFloat2; // auto un-Boxing*/
		//=======================================================================
		String str = new String ("java"); // Boxing
		 String str2 = "c"; //auto Boxing
		
		
		//=============================================================================================0
		// form string ...........................................
		  
		 
		String s21 = "20";
		int i = Integer.parseInt(s2);
		
		String s41 = "20";
		float f1 = Float.parseFloat(s2);
		
		String s51= "true";
		Boolean b = Boolean.parseBoolean(s51);
		
		
		String s61 = "abc";
		Character c = s4.charAt(0);
		
		
		//to String .................................................
		
		
		Integer i1 = new Integer (20);
		String str3 = i1.toString();
		String str4 =  String.valueOf(i1);
		String str5 = i1 + "java";
		
		int j = 20;
		String str6 = String.valueOf(j);
		String str7 = j + "";
//=========================================================================================================================================================================================================================================================================================================


 	  // BigInteger...............................................
 	   
 	   BigInteger bi1 = new BigInteger("12345678998765");
 	   BigInteger bi2 = new BigInteger("7654321876");
 	   
 	   BigInteger bi = null;
	BigInteger result = bi.add(bi2);
 	   
 	   
 	 //  ====================================================================================================================00
 	   //====================================================================================================================0
 	   // BigDecimal
 	     
 	    BigDecimal bd1 = new BigDecimal ("123.345");
 	    BigDecimal bd2 = new BigDecimal ("65432.345");
 	    BigDecimal result1 = bd1.subtract(bd2);
 	    System.out.println(result1);
 	    
 	    result1 = result1.setScale(2, RoundingMode.FLOOR);
 	    System.out.println(result1);
 	    

	}

	private static void test(int i2) {
		// TODO Auto-generated method stub
		
	}

}
