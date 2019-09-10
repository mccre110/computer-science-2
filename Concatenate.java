import java.util.*;
import java.io.*;

public class Concatenate 
{
	private ArrayList<String> inputList = new ArrayList<String>();
	private String fileOne;
	private String fileTwo;
	private String fileOutput;
	private boolean checkDump;

	public Concatenate(String fileOne, String fileTwo, String fileOutput)
	{
		this.fileOne = fileOne;
		this.fileTwo = fileTwo;
		this.fileOutput = fileOutput;
	}
	public void concate()
	{
		readIn(this.fileOne);
		readIn(this.fileTwo);
		readOut(this.inputList, fileOutput);

	}
	private void readIn(String fileName)
	{
		Scanner inputStream = null;
		try 
		{
			inputStream = new Scanner(new FileReader(fileName));
			
			while (inputStream.hasNextLine())
			{
				this.inputList.add(inputStream.nextLine());
			}

			inputStream.close();
			checkDump = true;	
		}  
		catch (IOException e) 
		{
			System.out.println("File Read Failed");
			checkDump = false;
		} 
	}
	private void readOut(ArrayList<String> output, String fileName)
	{
		PrintWriter outputStream = null;
		try {

			outputStream = new PrintWriter(new FileOutputStream(fileName));
			for (String s : output)
			{
				outputStream.println(s);
			}
			checkDump = true;
		} 
		catch (IOException e) {
			System.out.println("File Write Failed");
			checkDump = false;
		} 
		finally {
			outputStream.flush();
			outputStream.close();
		}
	}
	public String getOutput()
	{
		if (checkDump == true) {
			return (fileOne+" and "+fileTwo+" dumped to "+fileOutput);
		}
		return (fileOne+" and "+fileTwo+" not dumped to "+fileOutput);
	}
}