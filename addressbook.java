import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteFile 
{

	public static void main(String[] args) 
	{		
		Scanner scanner = new Scanner(System.in);
     	System.out.print("Enter file name: ");
	   String fileName = scanner.next();
		File log = new File("C:\\Users\\baluguru\\Desktop\\AddressBook\\"+fileName);

				try
				{
				    if(!log.exists())
				    {
				        System.out.println("We had to make a new file.");
				        log.createNewFile();
				    }

				   FileWriter fileWriter = new FileWriter(log, true);

				   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
					System.out.print("Enter Text to write: ");
					String text = scanner.next();
					//Object timeStamp ="newtext";
					bufferedWriter.write("******* " + text.toString() +"******* " + "\n");
				   bufferedWriter.close();
				   System.out.println("Done");
				} 
				catch(IOException e) 
				{
				    System.out.println("COULD NOT WRITE!!");
				}
		
		}

}

