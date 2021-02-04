// interface Interf{
//     void m1();

//     void m2();
// }
//  abstract class ServiceProvider implements Interf {
//     public void m1(){

//     }
// }

// class SubServiceProvider extends ServiceProvider{

//     @Override
//     public void m2() {

//     }
// }



// child parent relationship for private variables

// class parent {
//     private int x;
//     public int y;

//     public parent(int x ,int y){
//         this.x = x;
//         this.y = y;
//     }

//     public void m1(){
//         System.out.println(x + "..." + y);
//     }
// }

// class child extends parent {
//     public int z;
//     public static o;

//     public child(int x, int y, int z , int o){
//         super(x , y);
//         this.o = o;
//         this.z = z;
//     }

//     public void m2(){
//         int y = 10;
//         System.out.println( z + "" + y);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         child c = new child(10,20,30);
//         c.m1();
//         c.m2();
//     }
// }

