import java.util.Scanner;

public class demoForScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            System.out.println(scan.nextInt());
        }
        System.out.println("end");
        
    }
}
