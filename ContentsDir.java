import java.io.File;
public class ContentsDir 
{
	private String dir;
	private File searchDir;
	private String[] fileArray;
	private String fileListString ="List Contents: \n";
	
	public ContentsDir(String dir) throws NullPointerException
{
		this.dir = dir;
		this.searchDir = new File(dir);
		fileArray = this.searchDir.list();
  	}
	public String listFiles()
	{
		for (int i=0; i<this.fileArray.length; i++)
    	{
      		fileListString += this.fileArray[i] +"\n";
    	}
    	return fileListString;
	}
}	