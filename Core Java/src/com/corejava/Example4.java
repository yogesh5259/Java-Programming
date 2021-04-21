package com.corejava;


/**
 *Created by Yogesh Patel on 20/04/2021
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

    }
}

