//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long on1 = A;
        Long on2 = B;
        
        while( A % B != 0){
            Long rem = A % B;
            A = B;
            B = rem;
        }
        Long gcd = B;
        Long lcm = (on1 * on2) / gcd;
        Long [] lcmgcd = new Long[12];
        lcmgcd[0] = lcm;
        lcmgcd[1] = gcd;
        return lcmgcd;
    }
};