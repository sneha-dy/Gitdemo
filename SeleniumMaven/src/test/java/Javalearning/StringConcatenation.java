package Javalearning;

public class StringConcatenation {
    public static void main(String[] args) {

        String s = "Hello World";
        String s1 = "100";
        String ph = "97878676";
        String cc = "13434 5656 6767";

        String x = "hello";
        String y = "testing";

        int a = 100;
        int b = 200;

        System.out.println(a + b);//addition//300
        System.out.println(x + y);//concatenation//hellotesting

        System.out.println(x + a);//hello100
        System.out.println(a + x);//100hello
        System.out.println(a + b + x + y);//300hellotesting
        System.out.println(x + y + a + b);//hellotesting100200
        System.out.println(x + y + (a + b));//hellotesting200
        System.out.println(x + y + a + b + a + b);//hellotesting100200100200  concatenation

        System.out.println("the value of a:"+a);
        System.out.println("the value of a:"+b);
        System.out.println("the sum:"+a+b);
        System.out.println("the sume:"+(a+b));

        System.out.println(x+" "+y);//to add the space hello testing

        double c = 12.33;
        double d = 22.22;
        System.out.println(x+y+c+d);

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1+c2); // Ascii value

        byte b1 = 120;
        byte b2 = 50;
        int b3 = b1+b2;//(it's beyond the range



    }
}
