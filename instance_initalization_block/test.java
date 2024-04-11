public class test {

private static int k;
static
{

System.out.println("Static initialization Block: k="+k);
k=10;

}
public static void main(String args[]){

new test();

}

}

//age static block cholbe tarpor object k memory milbe
