import java.io.*;
class DeleteFile{
    public static void main(String args[])
    {
        File f = new File("FileCopy.txt");

        if(f.delete())
        {
            System.out.println("File Deleted "+f.getName());
        }
        else{
            System.out.println("Failed to Delete");
        }
    }
}