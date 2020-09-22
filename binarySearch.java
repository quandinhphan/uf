import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;


    public class binarySearch {

        private binarySearch() {}

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

        public static void main(String[] args){
            Stopwatch timer = new Stopwatch();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] a = new int[N];
            for(int i = 0; i < N; i++) {
                a[i] = (int)(Math.random() * N)+1;
            }

            Arrays.sort(a);
            int result = binarysearch(a,16);
            StdOut.println("elapsed time = " + timer.elapsedTime());
        }
    }
