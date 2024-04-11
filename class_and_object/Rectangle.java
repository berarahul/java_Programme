public class Rectangle{

private int  length;
private int width;

public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

public int  getArea(){
 int area=length*width;
  System.out.println("The Rectangle area is:: "+area);
return area;
}
public int getperimeter(){
int perimeter=2*(length+width);
System.out.println("The Rectangle perimeter is:: "+perimeter);
return perimeter;
}
public static void main(String args[]){

Rectangle r1 = new Rectangle(20,30);
r1.getArea();
r1.getperimeter();

}

} 
