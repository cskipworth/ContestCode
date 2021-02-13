//UDCS Programming Team 12/23/20
import java.util.Scanner;

public class SantaKlasClar {
    static Scanner scan;

    public static void main(String[] args) {
     
        scan = new Scanner(System.in);

        int H = scan.nextInt();
        double angle = (double)scan.nextInt();

        //Deal with the safe case
        if(angle <= 180){
            System.out.println("safe");
            return;
        }

        //Going to hit the ground; what is our distance?
        angle = angle * Math.PI / 180.0; //convert degrees to radians
        int dist = (int)(0.000001 + Math.abs(H / Math.sin(angle)));
        System.out.println(dist);
    }
}