import java.util.*;

// Memoization -> o(n) , Recursion -> o(2^n) !!
public class ClimbingStaires {
     public static int countWays(int ways[], int n) {
          if (n == 0) {
               return 1;
          }

          if (n < 0) {
               return 0;
          }

          if (ways[n] != -1) { // Already Calculated !!
               return ways[n];
          }
          ways[n] = countWays(ways, n - 1) + countWays(ways, n - 2) + countWays(ways, n - 3);
          return ways[n];
     }

     public static void main(String[] args) {
          int n = 5; // If case of 1 and 2 steps allowed
          // If 1,2 and 3 steps allowed only changes for recursion calls
          // countWays(ways, n - 1) + countWays(ways, n - 2) + countWays(ways, n -3)
          int ways[] = new int[n + 1];
          Arrays.fill(ways, -1);
          System.out.println(countWays(ways, n));

     }
}
