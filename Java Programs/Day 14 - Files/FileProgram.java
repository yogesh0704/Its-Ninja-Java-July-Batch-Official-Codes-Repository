import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class FileProgram {
    public static void main(String[] args) {
        
        File f = new File("NewFile.txt");

        System.out.println("Is the File Exists "+f.exists());

      /*   if(!f.exists())
        {
            try {
                f.createNewFile();    
                System.out.println("File created");
            } catch (Exception e) {
                System.out.println("File already Exists");
            }
            
        }
    
          //  System.out.println("Is the File readable "+ f.canRead());
          //  System.out.println("Is the File Writable "+ f.canWrite());
            try {
                FileWriter fw = new FileWriter(f); 
                fw.write("Hi This is my 1st program for writing a file");   
                fw.append("Hello 2nd Line");
                System.out.println("File has been Written");
                fw.close();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Unable to write into the File");
            }
         */
            try {
                Scanner read = new Scanner(f);
                File nf = new File("Copy.txt");
                nf.createNewFile();
                FileWriter fw = new FileWriter(nf);
                while (read.hasNextLine())
                {        
                    String data = read.nextLine();            
                    System.out.println(data);
                    fw.append(data + "\n");                    
                }
                fw.close();  
                read.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        

    }
}
