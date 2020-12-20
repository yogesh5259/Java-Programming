

class Customer{
    int a;
}
class Student{
    int b;
}
class newVsnewInstance {
    public static void main(String[] args) throws Exception {
        Object o = Class.forName(args[0]).newInstance();
        System.out.println("Object created for:" + o.getClass().getName());
    }
}