package Javalearning;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DataTypesConcept {
    public static void main(String[] args) {

        //Datatypes:

        //1.byte:
        //size 1 byte = 8 bits
        //range -128 to 127

        byte b =10;
        b =20;
        b =30;
        byte b1=40;
        byte b2=60;

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b+b1);
        ;

        //2.Short
        //Size: 2 bytes = 16 bits
        //Range:-32768 to 32767

        short s1= 1234;
        System.out.println(s1);

        //3.Integer
        //size: 4 bytes =32 bits
        //Range:-2147483648 to 247483647

        int i = 1234;
        int i1=-190;

        //4.Long
        //size: 8 bytes =64 bits
        //Range:

        long pop =100002200;
        long g=98786767565L;  //L is used to denote but will not be printed
        System.out.println(g);


        //5.float
        //size: 4 bytes = 32 bits
        //Range: after point it can take upto (7 digits)
        float f1 =12.33f;
        float f2=(float)34.55;
        System.out.println(f1);
        System.out.println(f1+f2);
        float f3 =100;
        System.out.println(f3);  //100.0

        //6.double
        //size: 8 bytes = 64 bits
        //range: after point it will take upto 16 decimal digits

        double d1=12.33;
        double d2=34.5555;

        //7.char
        //single digit value
        //size: 2 bytes =16 bits
         char c1='e'; //a-z and A-Z
         char c2='1'; //0-9
         char c3='$';
        System.out.println('e');

        //8.boolean:true or false
        //size: ~ 1bit(around 1 bit)
         boolean flag=true;
         boolean flag1=false;










    }
}
