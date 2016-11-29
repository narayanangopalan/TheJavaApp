import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

public static void main(String [] args) throws IOException

	{
	String file_path = args[0];

	BufferedReader br_file = new BufferedReader(new FileReader(file_path));
 	String line = null;
 	while ((line = br_file.readLine()) != null)
		{
   		System.out.println(line);
 		}
   }
}
