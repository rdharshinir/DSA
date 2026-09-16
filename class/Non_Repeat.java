import java.util.HashMap;



public class Non_Repeat {
    public static void main(String[] args) {
      
        int[] arr = {1,5,6,18,20};
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int n : arr){
            freq.put(n , freq.getOrDefault(n , 0) + 1);
        }
        for(int i : arr){
            if(freq.get(i) == 1){
                System.out.println(i);
            }
        }
        
    }
}
