package com.scanner;

import java.util.Scanner;

public class scannerprogram {


	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    
    int num=scan.nextInt();
    System.out.println("integer value"+num);
    byte num1=scan.nextByte();
    System.out.println("byte value"+num1);
    short num2=scan.nextShort(); 
    System.out.println("short value"+num2);
    Long num3=scan.nextLong();
    System.out.println("long value"+num3);
    int num4=scan.nextInt();
   int add=(num4+num);
   System.out.println(add);
   
   

   
  
   float f=scan.nextFloat();
   System.out.println("float value"+f);
   double d=scan.nextDouble();
   System.out.println("double value"+d);
   
  
   
   
   
   
    
    
 
		
	}

}
