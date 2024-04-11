class car{

private String brand;
private String model;
private String color;

public  car(String brand,String model,String color){

     this.brand=brand;
     this.model=model;
     this.color=color;
            
}

public void startEngine(){

	System.out.println("The brand is"+" "+brand);
}

} 

public class carr{
public static void main(String args[]){

car mycar=new car("Mercedes-Benz","AMG","Silver");

  mycar.startEngine();

}
}