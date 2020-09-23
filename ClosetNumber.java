import java.util.Scanner;
import java.util.Arrays;
public class ClosetNumber{
    public static int binarysearch(int[] a, int key){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[1] - arr[0];

        for (int i = 0; i < N-1; i++) {
            if(min > (arr[i+1] - arr[i])){
                min = arr[i+1] - arr[i];
            }
        }
        for (int i = 0; i < N-1; i++) {
            if(binarysearch(arr,arr[i]+min) != -1){
                System.out.print(arr[i]);
                System.out.print(" ");
                System.out.print(arr[i]+min);
                System.out.print(" ");
            }
        }
    }
}
