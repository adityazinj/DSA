import java.util.Arrays;
public class arrayswapindex {
    public static void main(String[] args) {
        int a[]={3,9,13,19,2};
        // swap(a, 0, 3);
        System.out.println(swap(a, 0, 4));
        max(a);
        // System.out.println(max(a));

        
    }
    static int swap(int arr[],int index1,int index2)
    {
        System.out.println("Unswapped Numbers :");
        System.out.println(arr[index1]+" "+arr[index2]);
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("Swapped Numbers :");
        System.out.println(arr[index1]+" "+arr[index2]);
        System.out.println();

        return temp;


    }
    static int max(int[] a)
    {
        int maxval=a[0];
        for(int i=0;i<maxval;i++)
        {
            if (a[i]>a[0]) {
                maxval=a[i];
                a[i]=a[0];
                a[0]=maxval;
                
            }
            System.out.println(maxval);

        }
        return 0;
    }
}
