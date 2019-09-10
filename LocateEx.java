import java.io.File;
public class LocateEx
{
	private String fileEx;
	private File directoryName;
	private File searchDir;
	private File[] pathNames;
	private String outputString = "Find extention: ";
	private boolean exFound = false;

	public LocateEx(String fileEx, String directory) throws NullPointerException
    {
    	this.fileEx = fileEx;
    	this.directoryName = new File(directory);
        outputString += fileEx+"\n";
        fileSearch(fileEx, directoryName);
    }
	private void fileSearch(String fileEx, File directoryName)
	{
		String filePath = "No Files Found\n";
		pathNames = directoryName.listFiles();
		for (File path: pathNames)
		{
			if(path.isDirectory())
				fileSearch(fileEx,path);
			else if(path.getName().endsWith(fileEx))
			{
				filePath = (path.getAbsolutePath()+"\n");
				outputString += filePath;
				exFound = true;
			}
		}
	}
	public String getOutput()
	{
		if (!exFound) 
		{
			outputString +="Extention Not Found\n";
		}
		return outputString;
	}
}