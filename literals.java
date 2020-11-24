public class literals {
    public static void main(String[] args) {
        //4 types of 
        //Integer Literals for (byte,short,int,long)
        int x = 10; //Decimal literal
        int y = 010; // Octal literal
        int z = 0x10; //Hexa decimal literal 
        int a = 0b101010; //Binary literal 
        System.out.println(x + "..." + y + "..." + z + "..." + a); // Jvm always return Decimal value.

        //2 type
        //Foloting point literals 
        double d = 123.456; // only decimal values are accepted.
        double d1 =  0123.456; // Even octal can be treated as a decimal number.
        double d2 = 0123; // treated as a octal integer then converted to decimal and then assigned to the double.
        // integer can be assigned as a octal decimal or in hexa-decimal form to double variable.
        double d3 = 0x123; 

        double d4 = 0b101010;
        double d5 = 1.7e34; // exponential form is valid 
        double d6 = 123.345d;
        System.out.println(d + "..." + d1 + "..." + d2 + "..." + d3 + "..." + d4 + "..." + d5 + "..." + d6);
        

        float f = 2147483647;  // assign int to float
        float f1 = 'a'; // Assign char to float, int, double, long
        System.out.println(f + " ..." + f1);


        //NOTE:
        // Integer number are bydefault integer.
        //floating point numbers are bydefault double. 

        // 4 type of character literals.
        char c = 'a'; //any unicode character in single code.
        char c1 = 97; // integer value in any valid int form. decimal,hexadecimal,octal,binary.
        char c2 = '\u0061'; // unicode representation of character.
        char c3 = '\n'; // any escape character.


        // 2 values are possible
        boolean b = true;
        boolean b1 = false;
    }
}
