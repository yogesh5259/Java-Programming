public class array {
    public static void main(String[] args) {
        //Array  
        //fixed in size and homoginous 

        //Array declaration
        //single dimension array
        int[] a = new int[3];
        int []b;
        int c[];

        //two dimension array declaration
        int[]  []d;
        int[] e[];
        int [][]f;
        int []g[];
        int[][] h;
        int i[][];

        //invalid 
        //int[] []j,[]k; this rule applicable for only first declaration.
        // We can not specify array size in array declaration.
        // Every array have related class. at language level which we dont have access.

        System.out.println(a.getClass().getName()); //[I

        int[] array = new int[3];
        array[0] = 'a';
        //array[1] = 10.10; //Possible lossy conversion from double to int
        System.out.println(array[0]);

        String s = "abc";
        Object o = s;

        int[][] z = new int[3][];
        //z[0] = 10; 
        z[0] = new int[3];


        

    }
}
