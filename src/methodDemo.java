import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methodDemo {

	public static void main(String[] args) {
		
		methodDemo md= new methodDemo();
		md.getdata();
		
		acess();
		methodDemo1 md1= new methodDemo1();
		String name =md1.names();
		System.out.println(name);
		String links= Keys.chord(Keys.CONTROL,Keys.ENTER);
List<Boolean> names=	Stream.of("sai","ram","saionara","shyam","sai","hi").filter(s->s.contains("sai")).map(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println(names);
	  
//	List<String> names =   Arrays.asList("sai","ram","cat","dog");
//	names.stream().f
	     String[] arr = {"sai","ram","cat","dog"};
	List<String> ugg =     Arrays.asList(arr);
	ugg.stream().filter(s->s.contentEquals("cat")).map(s->s.replace("cat", "rat")).forEach(s->System.out.println(s));
	
	//System.out.println(s);
	

	}

	public void getdata() {

		System.out.println("hello");
	}

	public static void acess() {
		System.out.println("hi");
	}

}
