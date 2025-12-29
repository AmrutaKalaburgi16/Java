public class Main {
    public static void main(String[] args) {

        int res=fact(5);
        System.out.println("Factorial is: "+res);
    }

    private static int fact(int i) {
        if(i==0){
            return 1;
        }
        return i*fact(i-1);
    }
}