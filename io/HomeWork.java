package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {
			public static void main(String[] args) {
				BufferedWriter bw = null;
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(new File("C:\\Users\\Sab\\Downloads\\Final Project.pdf")));
					bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Sab\\Downloads\\copyfbroject.pdf")));
					String s ;
					while((s = br.readLine()) != null) {
						bw.write(s);
						bw.flush();
						}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						bw.close();
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
}
