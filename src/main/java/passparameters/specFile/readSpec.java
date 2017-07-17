package passparameters.specFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readSpec {
	public static void main(String args[]) throws IOException
	{
		readspec("username");
	}
	public static void readspec(String key) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("src/main/java/passparameters/specFile/data.spec"));
		String line=" ";
		while((line=br.readLine())!=null)
		{
			if(line.contains("username"))
			{
			System.out.println(line);
			String [] parts=line.split(" +");
			for(int i=0;i<parts.length;i++)
			{
				System.out.println(i+" "+parts[i]);
			}
			}
		}
		
	}
	
	
}
