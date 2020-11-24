public class array {
    public static void main(String[] args) {
        //Array 

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

    }
}
