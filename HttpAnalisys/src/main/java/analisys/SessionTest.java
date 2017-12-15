package analisys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SessionTest {
	
	public static void main(String[] args) {
		
		
		File file = new File("Prova");
		BufferedReader br = null;
		FileReader fr = null;
		
		String currentLine = null;
		try 
		{
			fr = new FileReader(file);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
