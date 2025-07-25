import java.io.*;
class CreateFiles
{
    public static void main(String args[])
    {
        try{

        
            File f = new File("FilesExample.txt");
                    
            if(f.createNewFile())
            {
                System.out.println("File Created "+ f.getName());
            }
            else
            {
                System.out.println("File already Exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("File error Occured");
        }
    }
}