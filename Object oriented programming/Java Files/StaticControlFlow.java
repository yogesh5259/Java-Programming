class Base{
    static int i = 10;
    static{
        m1();
        System.out.println("First Static Block");
    }
    public static void main(String[] args){
        m1();
        System.out.println("Main Method");
    }
    public static void m1(){
        System.out.println(j);
    }
    static{
        System.out.println("Second Static Block");
    }
    static int j = 20;

}