
class instanceofOperator {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Thread); //true
        System.out.println(t instanceof Object); //true
        System.out.println(t instanceof Runnable); //true
        //System.out.println(t instanceof String);//error: incompatible types: Thread cannot be converted to String
    }
}