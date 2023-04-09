import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class dosyaİslemleri {
	public void  dosyaOku(String filepath){
		BufferedReader reader;

		try {
		reader = new BufferedReader(new FileReader(filepath,Charset.forName("UTF8")));
		String line = reader.readLine();
     
		while (line != null) {
		System.out.println(line);
		line = reader.readLine();
		System.out.println(line);
		}

		reader.close();
		}catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	public void dosyaYaz(String filepath, String line){

		BufferedWriter bw = null;
		try {
		File file = new File(filepath);
		if (!file.exists()) {
		file.createNewFile();
		}

		FileWriter fw = new FileWriter(file,true);
		bw = new BufferedWriter(fw);
		bw.write(line);
		System.out.println("File written Successfully");

		bw.close();

		} catch (IOException ioe) {
		ioe.printStackTrace();
		}
	}

}
