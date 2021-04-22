package com.corejava;


/**
 *Created by Yogesh Patel on 21/04/2021
 *
 *Refer Language Fundamentals -> Array.txt
 *
 *
 */
public class Example5 {
    public static void main(String[] args) {
        //one dimension array
        int[] a = {1,2,3}; //one line array declaration initialization and assignment
        int[] b =  new int[]{1,2,3}; //we won't able to specify size in this style

        //two dimension array
        //Array of arrays
        int[][] z = new int[3][];
        //z[0] = 10;
        z[0] = new int[10];


        //Invalid
        //int[] []y,[]w;


        int[] y[],q[];
        q = new int[12][];


    }




}
