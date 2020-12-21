
class Customer{

}
class Student{

}
public class instanceOfVsisInstance {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));
    }
}
