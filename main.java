import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an integer between 0 to 101");
        int a = scanner.nextInt();

        if (a == 100 || (18 <= a && a <= 20) || (38 <= a && a <= 40) || (51 <= a && a <= 53) || (71 <= a && a <= 74) || (85 <= a && a <= 86) || a == 98) {
            System.out.println("Sipahi");
        } else if ((1 <= a && a <= 4) || (34 <= a && a <= 37) || (54 <= a && a <= 58) || (93 <= a && a <= 97) || (16 <= a && a <= 17) || a == 99 || a == 30 || (41 <= a && a <= 45) || (81 <= a && a <= 84) || a == 70) {
            System.out.println("Chor");
        } else if ((5 <= a && a <= 6) || (13 <= a && a <= 15) || (21 <= a && a <= 23) || (27 <= a && a <= 29) || (31 <= a && a <= 33) || (59 <= a && a <= 64) || (75 <= a && a <= 77) || (90 <= a && a <= 93)) {
            System.out.println("Raja");
        } else {
            System.out.println("Wazir");
        }
    }
}