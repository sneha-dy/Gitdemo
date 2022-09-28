package Javalearning;

public class IfElseexample {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 55};
        //print multiples of 2

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
               // break;  only if we want to check multiple of 2
            } else {
                System.out.println("Is not multiple of 2:" + arr[i]);
            }
        }
    }
}
