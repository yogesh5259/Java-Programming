class Animal {
            
}
class Monkey extends Animal{

}

class Test {
    public void m1(Animal a){
        System.out.println("Animal version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey version");
    }

    public static void main(String[] args){
        Test t = new Test();

        Animal a = new Animal();
        t.m1(a);        //Animal version

        Monkey m = new Monkey();
        t.m1(m);        //Monkey version

        Animal a1 = new Monkey();
        t.m1(a1);       //Animal version
    }
}