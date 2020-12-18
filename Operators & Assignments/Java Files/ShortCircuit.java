

class ShortCircuit{
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        if(++x < 10 && (x/0 > 10)){
            System.out.println("Hello");
        } else{
            System.out.println("HI"); //HI
        }


        // if(++x < 10 && (x/0 > 10)){
        //     System.out.println("Hello");
        // } else{
        //     System.out.println("HI");
        // }

        // if(++x < 10 || ++y > 15){
        //     x++;
        // } else {
        //     y++;
        // }
        // System.out.println(x + "..." + y); // 12...16
    }
}