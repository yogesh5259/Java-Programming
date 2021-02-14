class P {
    int x = 888;
}
class C extends P {
    int x = 999;
}

class Test {
    public static void main(String[] args) {
        P p = new P();
        System.out.println(p.x);    // 888

        P p1 = new C();
        System.out.println(p1.x);   // 888

        C c = new C();
        System.out.println(c.x);    // 999

    }
}