public class Fibonocci {
     // Memoization Mathode !!
     public static int fib(int n) {
          int arr[] = new int[n + 1];
          if (n == 0 || n == 1) {
               return n;
          }

          if (arr[n] != 0) {
               return arr[n];
          }

          arr[n] = fib(n - 1) + fib(n - 2);
          return arr[n];

     }

     // Tabulation Mathode !!
     public static int fibTabulation(int n) {
          int dp[] = new int[n + 1];
          dp[0] = 0;
          dp[1] = 1;

          for (int i = 2; i <= n; i++) {
               dp[i] = dp[i - 1] + dp[i - 2];
          }

          return dp[n];
     }

     public static void main(String[] args) {

          System.out.println("Tabulation Mathode : " + fibTabulation(10));
          System.out.println("Memoization Mathode : " + fib(10));
     }
}