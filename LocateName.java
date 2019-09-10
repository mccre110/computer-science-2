import java.io.File;
public class LocateName
{
	private String fileName;
	private File directoryName;
	private File searchDir;
	private File[] pathNames;
	private String outputString = "Find file: ";
	private boolean fileFound = false;

	public LocateName(String fileName, String directory) throws NullPointerException
    {
    	this.fileName = fileName;
    	this.directoryName = new File(directory);
        outputString += fileName+"\n";
        fileSearch(fileName, directoryName);
    }
	private void fileSearch(String fileName, File directoryName)
	{
		String filePath;
		pathNames = directoryName.listFiles();
		for (File path: pathNames)
		{
			if(path.isDirectory())
				fileSearch(fileName,path);
			else if(fileName.equals(path.getName()))
			{
				filePath = (path.getParent()+"\n");
				outputString += filePath;
				fileFound=true;
			}
		}
	}
	public String getOutput()
	{
		if (!fileFound) 
		{
			outputString +="File Not Found\n";
		}
		return outputString;
	}
}