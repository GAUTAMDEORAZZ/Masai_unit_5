package Problem_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		
		String file=sc.nextLine();
		System.out.println("Enter the word to check their repeatation");
		String s=sc.next();
		 File f=new File(file);
		 try {
			f.createNewFile();
			System.out.println("File is created");
			FileWriter fw=new FileWriter(f);
			fw.write("Hello java world dsjdjkled ddkdlkeld dhdkedled dwwell dnc edwwlodlwel");
			
			fw.flush();
			FileReader fr=new FileReader(f);
			int count=0;
			char[] chr=new char[(int)f.length()];
			fr.read(chr);
			for(char c:chr){
//				System.out.print(c);
				System.out.println(s+" "+c);
			if(s.equals(chr)) {
				System.out.println(true);
				count++;
			}
			}
           System.out.println(file +" has character of  "+s +" is "+count);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
