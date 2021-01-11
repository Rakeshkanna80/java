package com.java.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("D:\\text.txt");  
			BufferedReader fileInput=new BufferedReader(file);
			
			for (int i = 0; i < 1; i++) {
				System.out.println(fileInput.readLine());
				
			}
			System.out.println(fileInput.readLine());
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
