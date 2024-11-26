package ProblemSet_8b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting{
	public String readTextFile(String filename)
{
		StringBuilder content = new StringBuilder();
		int counter=1;
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			while((line = reader.readLine())!=null) {
				content.append(displayLine(line, counter)).append("\n");
				counter++;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return content.toString();
		
}
	public String displayLine(String line, int count) {
		return line + " : "+count;
	}
}
class Main{
	public static void main(String[] args) {
		Counting c= new Counting();
		String content = c.readTextFile("words.txt");
	}
}