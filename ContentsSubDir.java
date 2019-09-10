import java.io.File;
public class ContentsSubDir 
{
    private String fileListString ="List Contents and Sub-Directories: \n";
    private String dir;
    private File searchDir;
    private File[] fileArray;

    public ContentsSubDir(String dir) throws NullPointerException
    {
        this.dir = dir;
        this.searchDir = new File(dir);
        fileArray = this.searchDir.listFiles();
    }
    public String listFiles()
    {
        RecursivePrint(fileArray,0,0); 
        return fileListString;
    }
    private void RecursivePrint(File[] fileArray,int index,int level) 
    {
        if(index == fileArray.length)
            return;
          
        for (int i = 0; i < level; i++)
            fileListString+=("\t");
          
        if(fileArray[index].isFile())
            fileListString+=(fileArray[index].getName()+"\n");
          
         else if(fileArray[index].isDirectory())
         {
            fileListString+=("Folder: " + fileArray[index].getName() + "\n");
            RecursivePrint(fileArray[index].listFiles(), 0, level + 1);
         }          

         RecursivePrint(fileArray,++index, level);
    }
}