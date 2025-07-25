import java.io.*;
import java.util.*;
class ReadFile
{
    public static void main(String args[])
    {
        try
        {
            File f = new File("FilesExample.txt");
            File f2 = new File("FileCopy.txt");

            if(f2.exists())
            {
                System.out.println("Already File exists");
            }
            else if(f2.createNewFile())
            {
                System.out.println("File Created "+ f2.getName());
            }

            Scanner read = new Scanner(f);
            FileWriter fw = new FileWriter("FileCopy.txt");

            while(read.hasNextLine())
            {
                String data = read.nextLine();
                System.out.println(data);
                
                
                fw.write("\n"+data);
            }            
        }
        catch(IOException e)
        {
            System.out.println("Files error " + e);
        }
    }
}