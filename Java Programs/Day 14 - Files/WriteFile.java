import java.io.*;
class WriteFile
{
    public static void main(String args[])
    {
        try{
            FileWriter fw = new FileWriter("FilesExample.txt");
            fw.write("Hi welcome to file handling in java");
            for(int i =1; i<=10; i++)
            {
                fw.write("\n5 X "+ i + " = "+ (5*i));
            }
            
            fw.close();

            System.out.println("File written successfully");
        }
        catch(IOException e)
        {
            System.out.println("File Error "+e.getMessage());
        }
    }
}