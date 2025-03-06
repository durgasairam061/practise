package practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadingDataFromTextFile {

	@Test
	void test1() throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("C:\\json data\\doc.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
          br.close();
	}
	

	@Test
	void test2() throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\json data\\doc.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	
	}
	@Test
	void test3() throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\json data\\doc.txt");
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	
	}
}
