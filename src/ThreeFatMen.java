import java.util.Scanner;

public class ThreeFatMen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int man1 = scan.nextInt();
        int man2 = scan.nextInt();
        int man3 = scan.nextInt();

        if (man1 == man2 && man2 == man3 && man1 == man3) {
            System.out.println(man1);
        }
        if (man1 > man2 && man1 > man3) {
            if (man1 <= 727 && man1 >= 94) {
                System.out.println(man1);
            } else {
                System.out.println("ERROR");
            }
        } else if (man2 > man1 && man2 > man3) {
            if (man2 <= 727 && man2 >= 94) {
                System.out.println(man2);
            } else {
                System.out.println("ERROR");
            }
        } else if (man3 > man1 && man3 > man2) {
            if (man3 <= 727 && man3 >= 94) {
                System.out.println(man3);
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
