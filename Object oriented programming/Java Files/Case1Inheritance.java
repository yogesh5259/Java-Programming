class Test {
    public void m1(int i){
        System.out.println("int arg");
    }
    public void m1(float f){
        System.out.println("float arg");
    }
}

class main{
    public static void main(String[] args){
        Test t = new Test();
        t.m1(10);   //int arg
        t.m1(10.5f); //float arg
        t.m1('a'); // int arg
        t.m1(100l); //float arg
        //t.m1(10.6); //no suitable method found for m1(double)
    }
}