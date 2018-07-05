package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.InputStream;
import java.io.FileWriter;
import java.io.FileReader;

public class MyClass {
	
	
	
	public static void main(String[] args) throws IOException  {
	
		
		File f = new File ("d:\\test.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.lastModified());
		
		File f2 = new File("d:\\prog\\java\\oo");
		System.out.println(f2.exists());
		System.out.println(f2.mkdirs());
		
		f2 = new File("d:\\prog\\java\\oo\\a.txt");
		System.out.println(f2.delete());
		
		File f3 = new File("d:\\f1");
		System.out.println(f3.delete());
		
		File f4 = new File("d:\\a.txt");
		f4.createNewFile();
		File f5 = new File ("d:\\new\\b.txt");
		
		f4.renameTo(f5);
		
		File f6 = new File ("d:\\prog.txt");
		String[] arr = f6.list();
		System.out.println(Arrays.toString(arr));
		
		File [] arr2 = f6.listFiles();
		System.out.println(Arrays.toString(arr2));
		
	
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// java.io
		
		/*
		 InputStream
		 OutputStream
		 
		 
		 Reader
		 Writer
		 */
		// outputStream
		{	
		File myFile = null;
		OutputStream out = null;
		try{
			myFile = new File("OutStream.txt");
			out = new FileOutputStream(myFile);
			// OutputStream out = new FileOutputStream (new File("d:\\OutStream.txt"));
			out.write(97);
			out.write(65);
			out.flush();
			
			
			String s = "Hello , Java!";
			byte[] b= s.getBytes();
			out.write(b);
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
	}
		// inputStream.....
	{
		File myFile = null;
		InputStream in = null;
		
		try{
			myFile = new File("OutStream.txt");
			in = new FileInputStream(myFile);
			/*int i ;
			while((i = in.read()) != -1) {
				System.out.print((char)i);
			}*/
			
			byte[] data = new byte[100];
			int i;
			while((i = in.read(data)) != -1) {
				for(byte e : data)
					System.out.println((char)e);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				in.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////7777
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////7
		///writer
	{
	 FileWriter out = null;
	 
	 try {
		out = new FileWriter(new File("Writer.txt"));
		out.write(79);
		
		out.flush();
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////7
	///////////////////////////////////////////////////////////////////////////////////////////////7
	
	// reader ::::
	
	{
		 FileReader in = null;
		 
		 try {
			in = new FileReader(new File("Writer.txt"));
			int i ;
			while((i = in.read()) != -1) {
				System.out.println((char)i);
			}
			
		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////7777777
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(new File("buffered.txt")));
			bw.write(" mohamed ddfrckljxcöklkcxjhlkvlkeökb");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
		
		{
			BufferedReader br = null;
			
			try {
				br = new BufferedReader(new FileReader(new File("buffered.txt")));
				String s ;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		
					
	  }
		
		///////////////////////////////////////////////////////////////////////////////////////////7
		{
					
			
			try (BufferedReader br = new BufferedReader(new FileReader(new File("buffered.txt")))){
				
				String s ;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
	
