package 28;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		boolean res = false;
		int left = 0; int right = n - 1;
        
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                res = true;
            }
            right--;
            left++;
        }
        System.out.println(res);
    }
}
