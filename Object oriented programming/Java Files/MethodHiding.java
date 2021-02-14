class P {
    public static void m1(){
        System.out.println("parent");
    }
}
class C extends P {
    public static void m1(){
        System.out.println("Child");
    }
}

class Test {
    public static void main(String[] args){
        P p = new P();
        p.m1();         //parent

        C c = new C();
        c.m1();         //child

        P p1 = new C();
        p1.m1();        //parent
    }
}
