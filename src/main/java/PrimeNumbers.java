import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        int lp = 0, p = 2;
        boolean t;
        Scanner pn = new Scanner(System.in);
        int n = pn.nextInt();
        while (lp < n) {
            t = true;
            double g = Math.sqrt(p);
            for (int i = 2; i <= g; i++)
                if (p % i == 0) {
                    t = false;
                    break;
                }
            if (t) {
                System.out.print(p + " ");
                lp++;
            }
            p++;

        }
        System.out.println();

    }
}
