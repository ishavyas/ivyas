package FileStreamExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\EmpFiles\\demo.txt");
		fos.write(70);
		fos.close();

	}

}
