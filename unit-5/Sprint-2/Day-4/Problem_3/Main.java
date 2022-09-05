package Problem_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name ");
		String file=sc.nextLine();
		File f=new File(file);
		f.createNewFile();
		System.out.println("file created");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello java world i am gautam deo java backend developer");
		bw.write("lets complete all assignment  ");
		bw.flush();
		bw.close();
		System.out.println("data dane");
		
//		FileReader fr=new FileReader(f);
//		BufferedReader br=new BufferedReader(fr)
		FileReader fr =new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		String up="";
		while(line != null){
		 up=line.toUpperCase();
		System.out.println(up);
		line=br.readLine();
		}
		br.close();
		File nf=new File("newfile.txt");
		nf.createNewFile();
		System.err.println("New file is created");
		FileWriter fnw=new FileWriter(nf);
		BufferedWriter nbf=new BufferedWriter(fnw);
		nbf.write(up);
		System.out.println("all text inserted in new file");
		nbf.close();
		
		
		
		
		

	}

}
