import java.util.Scanner;
import java.io.*;
public class main {
	public static String fileWriteString ="";
	public static String file = "";
	public static boolean writeFileBool = false;
	
	public static void main(String[] args)
	{
		file = textPrompt();
		mainMenu();

		if (writeFileBool && !file.equals("")) 
		{
			writeFile(file, fileWriteString);
		}
		System.out.println("Program terminated");
	}
	private static String textPrompt()
	{
		Scanner input = new Scanner(System.in);
		while (true)
		{
			System.out.println("Would you like to dump to a text file? [y/n]: ");
			String text = input.nextLine();
			if (text.toLowerCase().equals("y")) 
			{
				writeFileBool = true;
				System.out.println("Enter a filename: ");
				String fileName = input.nextLine();
				return fileName;

			}
			else if (text.toLowerCase().equals("n")) 
			{
				writeFileBool = false;
				return ("");
			}
			else
				System.out.println("Try Again");
		}
	}
	private static void mainMenu()
	{
		int loop = 0;
		while (loop !=6)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("(1) List the contents of a directory");
			System.out.println("(2) List the contents of a directory and subdirectories");
			System.out.println("(3) Locate a file with a given name");
			System.out.println("(4) Locate files with a given file extension");
			System.out.println("(5) Concatenate the contents of 2 files and output to a third file");
			System.out.println("(6) Exit");

			loop = input.nextInt();
			
			if (loop == 1)
			{
				input.nextLine();
				System.out.println("Enter Directory: ");
				String dir = input.nextLine();
				try
				{
					ContentsDir contentsDir = new ContentsDir(dir);
					String files = contentsDir.listFiles();
					System.out.println(files);
					fileWriteString += files;
				}
				catch (NullPointerException e)
				{
					System.out.println("Directory Not Found: "+ dir);
					fileWriteString +=("Directory Not Found: "+dir+"\n");
				}
			}
			else if (loop == 2) 
			{
				input.nextLine();
				System.out.println("Enter Directory: ");
				String dir = input.nextLine();
				try
				{
					ContentsSubDir contentsSubDir = new ContentsSubDir(dir);
					String files = contentsSubDir.listFiles();
					System.out.println(files);
					fileWriteString += files;
				}		
				catch (NullPointerException e)
				{
					System.out.println("Directory Not Found: "+ dir);
					fileWriteString +=("Directory Not Found: "+dir+"\n");
				}
			}
			else if (loop == 3) 
			{
				input.nextLine();
				System.out.println("File Name to Find: ");
				String file = input.nextLine();
				System.out.println("Directory to Search: ");
				String dir = input.nextLine();
				try
				{
					LocateName locateName = new LocateName(file, dir);
					System.out.println(locateName.getOutput());
					fileWriteString += locateName.getOutput();
				}
				catch (NullPointerException e)
				{
					System.out.println("Directory Not Found: "+ dir);
					fileWriteString +=("Directory Not Found: "+dir+"\n");
				}
			}
			else if (loop == 4) 
			{
				input.nextLine();
				System.out.println("File Extention to Find: ");
				String file = input.nextLine();
				System.out.println("Directory to Search: ");
				String dir = input.nextLine();
				try
				{
					LocateEx locateEx = new LocateEx(file, dir);
					System.out.println(locateEx.getOutput());
					fileWriteString += locateEx.getOutput();
				}
				catch (NullPointerException e)
				{
					System.out.println("Directory Not Found: "+ dir);
					fileWriteString +=("Directory Not Found: "+dir+"\n");
				}
			}
			else if (loop == 5) 
			{
				input.nextLine();
				System.out.println("Enter File 1 Name: ");
				String fileOne = input.nextLine();
				System.out.println("Enter File 2 Name: ");
				String fileTwo = input.nextLine();
				System.out.println("Enter Ouput File Name");
				String fileOutput = input.nextLine();
				Concatenate concatenate= new Concatenate(fileOne, fileTwo, fileOutput);
				concatenate.concate();
				fileWriteString += concatenate.getOutput();
			}
			else if (loop == 6)
				break;
			else
				System.out.println("Try again");
		}
	}
	private static void writeFile(String filename, String writeString)
	{
		PrintWriter outputStream = null;
		try {

			outputStream = new PrintWriter(new FileOutputStream(filename));
			outputStream.println(writeString);
		} catch (IOException e) {
			System.out.println("File Write Failed");
			
		} finally {
			outputStream.flush();
			outputStream.close();
		}
	}
}