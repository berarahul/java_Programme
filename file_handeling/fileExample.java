import java.io.*;

public class fileExample{

   public static void main(String args[]) throws IOException{

   	File f1=new File("/home/rahul/Desktop/file_handeling/rahul.txt");
   	f1.createNewFile();
   	System.out.println("IS Exist "+f1.exists());
   	System.out.println("File Size "+f1.length());
   	f1.delete();
   }

} 
