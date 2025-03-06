package practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("C:\\json data\\doc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("deepu is also nice");
       bw.close();
	}

}
