// Test Case 1 — One zero in the middle
// Input
// 7
// 1 0 1 1 0 1 1
// Output
// 5
// Explanation:
// Choose the window 1 1 0 1 1 1 and convert the single 0 to 1.
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
class Codechef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxones = 0;
        int left = 0;
        for(int right = 0 ; right < n ; right ++){
            map.put(arr[right], map.getOrDefault(arr[right], 0 ) + 1);
            while( arr[right] == 0 && map.get(arr[right]) > 1){
                map.put(0, map.get(arr[right])-1);
                left++;
            }
            maxones = Math.max(maxones, right - left + 1);
        }
        System.out.println(maxones);
    }
}
