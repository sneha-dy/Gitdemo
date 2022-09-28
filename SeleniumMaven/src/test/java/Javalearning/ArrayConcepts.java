package Javalearning;

import java.util.ArrayList;

public class ArrayConcepts {
    public static void main(String[] args) {
        //Arrays-We can store multiple value in one single variable

        int [] arr = new int [5]; // assign memory using new operator.Starts with zero index
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        //for loop arr.length  is 5
      /*  for(int i=0;i<arr.length;i++) //i=0 since array value starts with zero index
        {
            System.out.println(arr[i]);//2<5
        }
*/
        int [] arr2 ={1,2,3,4,5,6,7,8,11};

        System.out.println(arr2[2]);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
      //Store values in string
        String [] name = {"sneha","shetty","selenium"};

        for (int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }

        //enhanced for loop
        for(String s:name)
        {
            System.out.println(s);
        }

    ///Array list is a class in java

        ArrayList<String> a = new ArrayList<String>();//create a object  of the class
        a.add("Sneha");
        a.add("Shetty");
        a.add("selenium");
        a.remove(2);
        System.out.println(a.get(1)); //get method to get the index//Shetty







    }
}
