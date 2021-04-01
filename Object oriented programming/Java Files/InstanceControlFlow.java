/* public class InstanceControlFlow{
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
        InstanceControlFlow obj1 = new InstanceControlFlow();
    }
    public void m1(){
        System.out.println(j);
    }
    {
        System.out.println("Second Instance");
    }
    int j = 20;    
}
*/


class Parent {
    int i = 10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }
    Parent(){
        System.out.println("Parent Constructor");
    }
    public static void main(String[] args){
        Parent p = new Parent();
        System.out.println("Parent main");
    }
    public void m1(){
        System.out.println(j);
    }
    int j = 20;
}

class Child extends Parent{
    int x = 100;
    {
        m2();
        System.out.println("Child first instance block");
    }
    Child(){
        System.out.println("child Constructor");
    }
    public static void main(String[] args){
        Child  c = new Child();
        System.out.println("Child Main");
    }
    public void m2(){
        System.out.println(j);
    }
    {
        System.out.println("Child Second Instance Block");
    }
    int j = 200;
}