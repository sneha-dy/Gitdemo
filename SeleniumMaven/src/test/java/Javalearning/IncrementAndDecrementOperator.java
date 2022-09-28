package Javalearning;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {

        //++ increase the value by 1
        //-- decrease the value by 1

        //1.post increment:

        int a = 1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int g = -99;
        int h =g++;
        System.out.println(g);
        System.out.println(h);

        //2.pre-increment

        int c = 1;
        int d =++c;
        System.out.println(c);//2
        System.out.println(d);//2

        int m = -97;
        int n = m++;
        System.out.println(m);//-96
        System.out.println(n);//-97





    }
}
