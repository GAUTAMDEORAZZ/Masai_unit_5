package Problem_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		File f= new File("student.txt");
		f.createNewFile();
		System.out.println(f.exists());
		PrintWriter pw= new PrintWriter(f);
		pw.write("Ram");
		pw.write(89);
		pw.write(69);
		pw.write(84);
		pw.write(59);
		pw.write(56);
		pw.write(58);
		pw.write("Shayam");
		pw.write(69);
		pw.write(93);
		pw.write(64);
		pw.write(66);
		pw.write(86);
		pw.write(78);
		
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();

	}

}
