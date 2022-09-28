package Javalearning;

public class MethodsConcepts {
    public static void main(String[] args) {
        MethodsConcepts d = new MethodsConcepts();
        d.getData();
        String s = d.getData();
        System.out.println(s);

        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        System.out.println(d1);

        getData2();
    }

    /*Methods-why methods-set of line of code which we want to reuse
     * If we want to create a method in class,we should not be created inside the main method.
     * Main is reserved for execution*
     void means what the method returns.ex if method returns int*/


    public String getData()
    {
        System.out.println("Hello World");
        return "Sneha";
    }
    public static String getData2()
    {
        System.out.println("Static method");
        return "Shetty";
    }
}
