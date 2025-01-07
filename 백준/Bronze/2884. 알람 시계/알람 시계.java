import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();
//알람을 45분 빨리 맞추려 함.
        if(min >= 45){
            min -=45;
        }else{
            min+=15;
            if(hour==0){
                hour =23;
            }else{
                hour -= 1;
            }
        }
        System.out.println(hour + " " + min);
    }
}