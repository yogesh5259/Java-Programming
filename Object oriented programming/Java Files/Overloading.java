class Test {
    public void m1() {
        System.out.println("no arg");
    }
    public void m1(int i) {
        System.out.println("int arg");
    }
    public void m1(double d) {
        System.out.println("double arg");
    }
    public void m1(int i,double d) {
        System.out.println("int and double arg");
    }
    public void m1(double d, int i) {
        System.out.println("double and int arg");
    }
    public void m1(double d, int i, int p) {
        System.out.println("double int and int arg");
    }
}

public class Overloading{
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m1(10);
        t.m1(10.5);
        t.m1(10,10.5);
        t.m1(10.5,10);
        t.m1(10.5,10,10);
    }
}