package starPrograms;

public class StarEx1 {

    public static void main(String[] args) {
        String image = "*";
        int row = 6;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(image + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        for (int i = 0; i < row; i++) {

            for (int j = 2 * (row - i); j >= 0; j--) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(image + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

    }
}
