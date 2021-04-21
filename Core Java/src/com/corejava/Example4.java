package com.corejava;


/**
 *Created by Yogesh Patel on 21/04/2021
 *
 *Refer Language Fundamentals -> java File -> literals.java
 *
 * Assignment of literal value to the datatype
 * byte, short, int, char, long, float, double, boolean
 *
 * All below must be in range of corresponding data type otherwise we need to type cast
 *
 */

public class Example4 {
    public static void main(String[] args) {
        // Assign literal to the byte datatype
        byte b2 = 127; //decimal value
        byte b3 = 012; //octal value // 8^1 * 1 + 8^0 * 2  = 10
        byte b4 = 0x1A; //hex value (it can be in uppercase or lowercase)
        byte b5 = 0b110; //binary
        byte b6 = 'a'; // character
        System.out.println(b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6);

        //assign literal value to short data type
        short s = 10; // decimal
        short s1 = 010; //octal
        short s2 = 'a'; // char
        short s3 = 0xA; //hex
        short s4 = 0b101; //binary
        System.out.println(s + " " + s1 +" " + s2+ " " + s3 + " " + s4 );


        //assign literal to the int data type
        int i = 10;// decimal
        int i1 = 010; // octal
        int i2 = 0xab; //hex value
        int i3 = 0b101; //binary
        System.out.println(i + " " + i1 + " " + i2 + " " + i3);

        //assign literal value to char data type
        char c = 100; // int in any above form (decimal, octal, hex, binary)
        char c1 = '\n'; //escape character
        char c2 = 'c'; // char
        char c3 = '\u0061'; //unicode
        System.out.println(c + " " + c1 + " " + c2 + " " + c3);

        //assign literal to long
        //any small data type char, int, byte, short in any form
        long l1 = 2147483648L; // (l / L)  //default treated as int so we need to add L at the end.
        long l2 = 10;
        System.out.println(l1 + " " + l2);


        //assign literal to float
        //any small data type char, int, byte, short, long in any form
        float f = 10;
        float f1 = 10F; //(f / F)
        float f2 = 010.50F; // by default floating point is treated as double so we need to add f at the end.
        System.out.println(f + " " + f1 + " " + f2);


        //assign literal to double
        //any small data type char, int, byte, short, long, float in any form
        double d1 = 10; // any form of int
        double d2 = 100D; //(d/D) optional by default floating point number is double
        double d3 = 1010.10; // by default floating point is treated as double so we need to add f at the end.
        double d4 = 01010.101; // treated as floating point as it is not octal
        double d5 = 0101;// octal to int and then to double
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);



    }
}

