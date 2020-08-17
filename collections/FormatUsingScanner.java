// question number 19
package com.quantumtest.collections;

import java.util.Scanner;

public class FormatUsingScanner {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Format Using Scanner");
        System.out.println("Enter your number ");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int y =sc.nextInt();
            
          
            System.out.printf( "%-10s%03d%n", s1,x,y);
            
        }
        
      	

}
}
