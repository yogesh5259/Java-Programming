class VarArg {
    public static void main(String[] args) {
        sum(new int[]{10,20,30});
    }
    public void sum(String[] ... a){
        
    }
    public static void sum(int ... a){
        System.out.println("Inside int...");
    }

    //error: cannot declare both m1(int...) and m1(int[]) in VarArg
    // public static void m1(int[] a){

    // }

    // public static void m1(int... x){

    // }
}