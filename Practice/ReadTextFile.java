package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\AnujGarg\\Downloads\\test.txt");
		BufferedReader b = new BufferedReader(new FileReader(f));
		Scanner s = new Scanner(f);
		System.out.println(s.nextLine());
		

	}

}
