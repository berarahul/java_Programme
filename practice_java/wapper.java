public class wapper {
    public static void main(String args[]){


        Integer  i1= Integer.valueOf("123", Integer.parseInt("101011"));
        Double d1=Double.valueOf("12.30");
        int a = Integer.parseInt("145");  //here Basicallly ue use a Integer wrapper class when parseInt is a function whose present inside the class
        double b=Double.parseDouble("122.90");//

        System.out.println(i1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(b);
        int c=i1.intValue();
        System.out.println(c);
    }


}
