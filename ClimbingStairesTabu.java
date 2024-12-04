public class ClimbingStairesTabu {

     // Tabulation -> o(n) !!

     public static int countWaysTabu(int n) {
          int dp[] = new int[n + 1];
          dp[0] = 1;

          for (int i = 1; i <= n; i++) {
               if (i == 1) { // If Negative Index call !!
                    dp[i] = dp[i - 1] + 0;
               } else {
                    dp[i] = dp[i - 1] + dp[i - 2];
               }
          }

          return dp[n];
     }

     public static void main(String[] args) {
          int n = 5;
          System.out.println(countWaysTabu(5));
          System.out.println(countWaysTabu(4));
          System.out.println(countWaysTabu(3));
          System.out.println(countWaysTabu(2));
          System.out.println(countWaysTabu(1));
     }
}
