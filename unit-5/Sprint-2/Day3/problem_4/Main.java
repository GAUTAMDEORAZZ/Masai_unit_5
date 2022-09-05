package problem_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
     
	
	
	 public static void copyFile(File x,File y) throws Exception {
		 FileInputStream fis=new FileInputStream(x);
		 FileOutputStream fos=new FileOutputStream(y);
		 
		 try {
			  
	           int n;
	         while ((n = fis.read()) != -1) {
	                
	                fos.write(n);
	            }
	        }
	        finally {
	            if (fis != null) {
	                fis.close();
	            }
	           
	            if (fos != null) {
	                fos.close();
	            }
	        }
	        System.out.println("File Copied");
	    }
		 
		 
	 
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputfile=sc.nextLine();
		File x=new File(inputfile);
		x.createNewFile();
		System.out.println("Enter the output file name");
		String outputFile=sc.nextLine();
		File y=new File(outputFile);
		y.createNewFile();
		
		try {
			copyFile(x,y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
