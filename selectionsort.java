import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={8,4,0,2,7,3,5,1,6};
        selectionsort(arr);
        
    }
    static void selectionsort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    mn = j;
                    
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    
}
