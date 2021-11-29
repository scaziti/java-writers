import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingWriters {
	
	public static String PATH = "/home/scaziti/Desktop/out.txt";
	
	public static void main(String[] args) {
		
		String[] list = new String[]{"Hello,", "how are you doing?"};
		
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true)));
		// It'll be add more information in an existing file
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH))){
			
			for (String st : list) {
				bufferedWriter.write(st);
				bufferedWriter.newLine();
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
	}

}
