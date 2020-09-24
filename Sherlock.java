import java.util.Scanner;
public class Sherlock {
    public static String balancedSums(int[] arr, int N) {
        int count = 0;
        for(int i = 0; i < N; i++){
            int tong1 = 0, tong2 = 0;
            if(i!=N-1){
                for(int j=i+1; j < N; j++){
                    tong1 = tong1 + arr[j];
                }
            }
            if(i!=0){
                for(int k=i-1; k >= 0; k--){
                    tong2 = tong2 + arr[k];
                }
            }
            if(tong1==tong2){
                count++;
            }
        }
        if(count==0){
            return "NO";
        }else{
            return "YES";
        }
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


