import java.util.Scanner;
public class Sherlock {
    public static String balancedSums(int[] arr, int N) {
        int tong = 0, tongnho =0;
        for(int i = 0; i < arr.length ; i++){
            tong = tong + arr[i];
        }
        for(int i = 0; i < arr.length ; i++){
            if (tongnho * 2 == tong - arr[i]){
                return "YES";
            }
            tongnho = tongnho + arr[i];
        }
        return "NO";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for (int n = 0; n < M; n++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(balancedSums(arr,N));
        }
    }
}


