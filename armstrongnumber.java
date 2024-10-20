import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean ans = Armstrong(x);
        System.out.println(ans);
   
    }

    // only for 3 digits armstrong numbers

    static boolean Armstrong(int n) {
        int original = n;
        int rem = 0;
        int res = 0;
        int outp = 0;
        while (0 < n) {
            rem = n % 10;
            res = rem * rem * rem;
            outp += res;

            n /= 10;

        }
        if (outp == original) {
            System.out.println(outp);
            return true;
        } else {
            return false;
        }
    }

}
