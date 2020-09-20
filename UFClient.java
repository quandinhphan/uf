import edu.princeton.cs.algs4.*;
public class UFClient {
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int K=0;
        int count=0;
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q))
            {
                uf.union(p, q);
            }
            count++;
            if(K==0){
                for(int i=0;i<N;i++) {
                    int dem = 0;
                    for (int j = 0; j < N; j++) {
                        if (uf.connected(i, j)) {
                            dem++;
                        }
                    }
                    if (dem == N) {
                        K = count;
                        break;
                    }
                }
            }
        }
        if(K==0){
            StdOut.print("FAILED");
        }else{
            StdOut.print(K);
        }
    }
}