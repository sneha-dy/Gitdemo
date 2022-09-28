package Javalearning;

public class IfElseCondition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {

            System.out.println("a is greather b");
        } else {
            System.out.println("b is greater than a");
        }
        if (a == b) {
            System.out.println("both are equal");
        }

        int number = 90;
        if (number <= 100) {
            if (number >= 90) {
                System.out.println("Grade A");
            }
            if (number >= 75) {
                System.out.println("Grade B");
            }
        }
        else{
            System.out.println("invalid number");
        }



        ///
        String browser = "firefox";

        if(browser.equals("chrome"))
        {
            System.out.println("launch chrome");
        }
        else if (browser.equals("firefox")){
            System.out.println("launch firefox");
        }
       else if (browser.equals("IE")) {
            System.out.println("launch Ie");
        }
       else {
            System.out.println("plz pass the right browser");

        }

























































    }
}
