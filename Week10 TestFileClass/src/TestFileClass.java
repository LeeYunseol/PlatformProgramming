import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class TestFileClass {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("src/Sample.txt");
		System.out.println("Does it exist?" + file.exists());
		System.out.println("Absoulute path is " + file.getAbsolutePath());
		try {
			System.out.println("Canonocial path is " + file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		File file2 = new File("src/socres.txt");
		if(file2.exists())
		{
			System.out.println("File is already exists");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(file2);
		output.print("John T Smith");
		output.println(90);
		output.print("Eric K Jones");
		output.println(85);
		output.close();
	}
}
