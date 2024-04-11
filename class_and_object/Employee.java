public class Employee{

private String name;
private int age;
 private int salary;
 private static int percentage=4;

public Employee(String name, int age, int salary){

	this.name=name;
	this.age=age;
	this.salary=salary;
}

public  int get_salary_raise(){

  int increaseAmount=salary*percentage/100;
  int totalsalary=increaseAmount+salary;
  System.out.println("After 4 Percent Sallary Increase Amount Is:: "+totalsalary);
  return totalsalary;
}
public static void main(String args[]){

	Employee E1= new Employee("Rahul",20,100000);
	E1.get_salary_raise();
}

}

