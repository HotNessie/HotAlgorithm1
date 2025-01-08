import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        int cookedHour = cookingTime / 60;
        int cookedMin = cookingTime % 60;

        hour += cookedHour;
        min += cookedMin;

                if (min >= 60) {
                    hour += 1;
                    min -= 60;
                }

                if (hour > 23) {
                    hour -= 24;
            }
        System.out.println(hour+" " + min);
    }
        }


