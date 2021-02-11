class Test {
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer version");
    }
    public void m1(String s){
        System.out.println("String version");
    }
}

class main{
    public static void main(String[] args){
        Test t = new Test();
        t.m1(new StringBuffer("yogesh")); //StringBuffer version
        t.m1("yogesh");     //String version
        //t.m1(null);         //compile time error:- reference to m1 is ambiguous
    }
}