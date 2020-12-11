public class Main {

    static{
        System.out.println("inside static block");
        System.exit(0);
    }

        //valid 
    // public static void main(String[] args) {
    //     System.out.println("Parent main method...");
    // }


        // Valid
    // public static final synchronized strictfp void main(String[] args){
    //     System.out.println(" parent main method...");
    // }

        //Valid
    // static      public     void     main(String[] args) {
    //     System.out.println("main method...");
    // }

        //Invalid
    //Error: Main method not found in class Main, please define the main method as:
    // public static void ypmain(String[] args) {
    //     System.out.println("main method...");
    // }
}