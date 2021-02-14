class Parent{
    public void property(){
        System.out.println("Gold");
    }
    public void marry(){
        System.out.println("Mary");
    }
}

class Child extends Parent {
    public void marry(){
        System.out.println("Priyanka");
    }
}

class Test{
    public static void main(String[] args){
        Parent p = new Parent();
        p.marry();

        Child c = new Child();
        c.marry();

        Parent p1 = new Child();
        p1.marry();
    }
}