class ArithmaticOperators {
    public static void main(String[] args) {
        // final int x = 10;
        // //x++; // error: cannot assign a value to final variable x
        // System.out.println(x);

        // boolean x = true;
        // x++; //error: bad operand type boolean for unary operator '++'
        // System.out.println(x);


        // byte b = 10;
        // b++;
        // System.out.println(b); // 11


        // byte b = 10;
        // b = b + 1; //error: incompatible types: possible lossy conversion from int.
        // System.out.println(b);

        //System.out.println(0.0/0); //NaN
        //System.out.println(0/0); // compile time error
        //System.out.println(10/0); // compile time error
        System.out.println(10.0/0); //Infinity

        // int x = 10;
        // System.out.println(x > Float.NaN); //false
        // System.out.println(x >= Float.NaN); //false
        // System.out.println(x < Float.NaN); //false
        // System.out.println(x <= Float.NaN);//false
        // System.out.println(x == Float.NaN);//false
        // System.out.println(x != Float.NaN); // true
        // System.out.println(Float.NaN != Float.NaN); //true



    }
}