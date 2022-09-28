package Javalearning;

public class NestedLoops {
    public static void main(String[] args) {
        /*Nested Loops*/
        for(int i=1;i<=4;i++){
            System.out.println("outer loop started");
        }
        for(int j=1;j<=4;j++)
        {
            System.out.println("innner loop started");
        }
        System.out.println("outer loop finished");
    }
}
/*print
* 1 2 3 4
* 5 6 7
* 8 9
* 10*/
