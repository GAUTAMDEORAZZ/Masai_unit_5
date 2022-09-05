import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
	 File f=new File("abc.txt");
	 try {
		f.createNewFile();
		System.out.println("File is created");
		FileWriter fw=new FileWriter(f);
		fw.write("Hello java world");
		fw.write("jai ho");
		fw.flush();
		FileReader fr=new FileReader(f);
		char[] chr=new char[(int)f.length()];
		fr.read(chr);
		for(char c:chr){
		System.out.print(c);
		}
//		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

	}

}
