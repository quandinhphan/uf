import java.util.Scanner;

public class NewYearChaos {
    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String calculate(int[] arr){
        int count = 0;
        for (int j = arr.length-1; j >= 0; j--) {
            if (arr[j] != j+1) {
                if ((j-1) >= 0 && arr[j - 1] == j+1) {
                    count++;
                    swapArray(arr, j - 1, j);
                }
                else if ((j-2) >=0 && arr[j - 2] == j+1) {
                    count = count + 2;
                    swapArray(arr, j - 2, j - 1);
                    swapArray(arr, j - 1, j);
                } else {
                    return ("Too chaotic");
                }
            }
        }
        return (Integer.toString(count));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            int[] arr = new int[k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(calculate(arr));
        }
    }

}
