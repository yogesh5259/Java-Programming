class Test {
    public void m1(int i){
        System.out.println("general method");
    }
    public void m1(int... vararg){
        System.out.println("vararg method");
    }
}

class main{
    public static void main(String[] args){
        Test t = new Test();
        t.m1();       //vararg method
        t.m1(10,20); //vararg method
        t.m1(10); //general method
    }
}