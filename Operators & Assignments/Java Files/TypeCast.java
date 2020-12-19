class TypeCast{
    public static void main(String[] args) {
        // int x = 130;
        // byte b = x; //error: incompatible types: possible lossy conversion from int to byte
        // System.out.println(b);
        
        // int x = 130;
        // byte b = (byte)x; 
        // System.out.println(b); // -126

        int x = -150;
        short s = (short) x;
        System.out.println(s); //150

        byte b = (byte) x;
        System.out.println(b);  //-106

        // double d = 130.456;
        // int x = (int)d;
        // System.out.println(x);//130

        // byte b = (byte)d;
        // System.out.println(b);//-126
    }
}
