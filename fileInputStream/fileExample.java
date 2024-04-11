import java.io.*;

public class fileExample{

	public static void main(String args[]) throws IOException{

		int i;
		FileInputStream fis;
		fis=new FileInputStream("/home/rahul/Desktop/fileInputStream/rahul.txt");
		do{
              i=fis.read();
              if(i!=-1)
              	System.out.print((char)i);

		}while(i!=-1);
		fis.close();
	}
} 
