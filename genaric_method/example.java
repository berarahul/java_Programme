public class example{

public <E>void printarray(E []s){
	for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
} 
public static void main(String args[]){
	example e1=new example();
	String countries[]=new String[]{"India","Pakistan","Nepal"};
	Integer number[] ={12,34,56,77};
	 e1.printarray(countries);
     e1.printarray(number);
}

} 
