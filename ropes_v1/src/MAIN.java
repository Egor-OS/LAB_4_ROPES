import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of ropes... pls...");
        int size = sc.nextInt();
        Arr ob = new Arr(size);
        //ob.size=size;
        ob.General_arr(size);
        long time = start - System.currentTimeMillis();
<<<<<<< HEAD
        System.out.println("TIME: "+(-time));
=======
        System.out.println(time);
>>>>>>> master
    }
}
