package generics;

public class TestGenerics<T> {
    T ob;
    TestGenerics(T ob){
        this.ob = ob;
    }
    public T getValue(){
        return ob;
    }

    public void getType(){
        System.out.println(ob.getClass().getName());
    }


    public static void main(String[] args) {
        TestGenerics<Integer> testInteger = new TestGenerics<>(10);
        testInteger.getType();
        TestGenerics<String> testString = new TestGenerics<>("This is a test String..");
        testString.getType();

    }
}
