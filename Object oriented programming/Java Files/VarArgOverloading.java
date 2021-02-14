class P {
    public void m1(int... i){
        System.out.println("var arg");
    }
}
class C extends P {
    public void m1(int i){
        System.out.println("int arg");
    }
}
class Test {
    public static void main(String[] args){
        P p = new P();
        p.m1(10);       //var arg

        C c = new C();
        c.m1(10);       //int arg

        P p1 = new C();
        p1.m1(10);      // var arg
    }
}