import java.io.*;

public class fileExample{

	public static void main(String args[]) throws IOException{
                   
               FileWriter fw=new FileWriter("file.txt",true);
               BufferedWriter  bf=new BufferedWriter(fw);
               bf.write("computer");
               bf.close(); 


	}
} 
