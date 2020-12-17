

public class Equality_Operator {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2); // false
        System.out.println(t1 == t3); // true


        Object o = new Object();
        Thread t = new Thread();
        String s = new String();
        System.out.println(t == o); // false
        System.out.println(o == s); // false
        //System.out.println(s == t); //compile time error:-error: incomparable types: String and Thread
        
        String s1 = new String("Yogesh");
        System.out.println(s1 == null); // false

        String s2 = null;
        System.out.println(s2 == null); // true

        System.out.println(null == null); //true
    }
}
