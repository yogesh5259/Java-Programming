class Test {
    public void m1(int i, float f){
        System.out.println("int - float arg");
    }
    public void m1(float f, int i){
        System.out.println("float - int arg");
    }
}

class main{
    public static void main(String[] args){
        Test t = new Test();
        t.m1(10,10.5f); //int - float arg
        t.m1(10.5f, 10); //float - int arg 
        //t.m1(10,10); //compile time error:- reference to m1 is ambiguous 
        //t.m1(10f,10f); //compile time error:- no suitable method found for m1(float,float)

    }
}
