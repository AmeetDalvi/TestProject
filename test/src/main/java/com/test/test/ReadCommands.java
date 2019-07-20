package com.test.test;

import java.util.Scanner;

public class ReadCommands {
	
				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in); 
					
					
						System.out.println("Enter your name");
						String name = scanner.next();
						
						System.out.println("Enter your age");
						int age = scanner.nextInt();
						
						System.out.println(String.format("%s , your age is %d", name, age));
					
				}
	
}
