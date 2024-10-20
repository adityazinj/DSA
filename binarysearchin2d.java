
import java.util.Scanner;
import java.util.Arrays;

class binarysearchin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        twod(arr);

        // Target Finding in The 2d arrays
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        int[] ans=serach(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static void twod(int[][] arr) {
        System.out.print("Enter Element Into The 2D Array :");

        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
            System.out.println(Arrays.toString(arr[row]));
        }

    }

    static int[] serach(int[][] arr, int target) {

        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {

                return new int[] { row, col };

            } 
            else if (target > arr[row][col]) {

                row++;

            } else {
                col--;
            }

        }
        return new int[] { -1, -1 };
    }
    
}
