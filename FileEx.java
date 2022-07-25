package multithreading;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileEx {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\naveen\\OneDrive\\Desktop\\Naveenkumar\\abc.txt");
		try {
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			fw.write("Hello EveryOne....");
			fw.flush();
			fw.close();
			FileReader fr=new FileReader(f);
			int a=fr.read();
			while(a!=-1) {
				System.out.print((char)a);
				a=fr.read();
			}
		}catch (Exception e) {
		}
		File f1=new File("C:\\Users\\naveen\\OneDrive\\Desktop\\Naveenkumar\\kumar.txt");
        f1.delete();

	}

}
