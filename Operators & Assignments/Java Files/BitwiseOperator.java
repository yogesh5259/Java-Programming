class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(true & false); // false
        System.out.println(true | false); // true
        System.out.println(true ^ false); // true

        System.out.println(4 & 5); // 4
        System.out.println(4 | 5); // 5
        System.out.println(4 ^ 5); // 1

        // ~ (bitwise compliment operator)
        //System.out.println(~true); // Compile time error:-error: bad operand type boolean for unary operator '~
        System.out.println(~4);

        // ! (Boolean compliment operator)
        //System.out.println(!4); // compile time error:- bad operand type int for unary operator '!'
    }
}