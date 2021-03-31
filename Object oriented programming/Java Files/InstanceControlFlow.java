public class InstanceControlFlow{
    int i = 10;
    {
        m1();
        System.out.println("First Instance");
    }

    InstanceControlFlow(){
        System.out.println("Constructor");
    }
    public static void main(String[] args){
        InstanceControlFlow obj = new InstanceControlFlow();
        System.out.println("Main Method");
    }
    public void m1(){
        System.out.println(j);
    }
    {
        System.out.println("Second Instance");
    }
    int j = 20;    
}