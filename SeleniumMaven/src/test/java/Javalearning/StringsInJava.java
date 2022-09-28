package Javalearning;

public class StringsInJava {
    public static void main(String[] args) {
       /* String is an Object that represents sequence of characters
        how many ways you can define string?
        2 two-String literal-It won't creat new object
         and new memory opertor*/

      /*  String s = "Sneha Shetty";
       // String s1 = "Sneha Shetty"; //it will point s1 to same object that is s(literal

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");*/  //it will create new object everytime when we use the new Keyword

        String s1 = "Sneha Shetty Selenium";
        String [] splittedString=s1.split(" ");

        //print the value
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());

        for(int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
        }

        //reverse string
        for(int i=s1.length()-1;i>=0;i--){
            System.out.println(s1.charAt(i));
        }
    }
}
