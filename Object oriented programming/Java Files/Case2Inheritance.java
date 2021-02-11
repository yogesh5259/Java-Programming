class Test {
    public void m1(Object o){
        System.out.println("object version");
    }
    public void m1(String s){
        System.out.println("String version");
    }
}

class main{
    public static void main(String[] args){
        Test t = new Test();
        t.m1(new Object()); // object version
        t.m1("yogesh");     // String version
        t.m1(null);         //String version
    }
}