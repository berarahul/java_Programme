public class Circle{

	private int radius;
	private String color;
    public Circle(int radius,String color){
         
         this.radius=radius;
         this.color=color;
    }
    public void getcolor(){
    	System.out.println("The color is " +color);

    }
    public double calculatearea(){
    
   double  area=3.14*radius*radius;
       System.out.println("Circle of a Area is:: "+area);
       return area;

    }

 public static void main(String[] args) {

    	Circle c1=new Circle(12,"Blue");
    	c1.calculatearea();
    	c1.getcolor();
    	
    }
} 
