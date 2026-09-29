package 28;
import java.util.HashSet;
public class Count_vc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int count_v = 0;
		int count_c = 0;
		HashSet<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
		s.toLowerCase();
		for(char ch : s.toCharArray()){
		    if(vowels.contains(ch) ){
		        count_v++;
		    }
		    else count_c++;
		}
		System.out.println("vowels"+count_v);
		System.out.println("consonents"+count_c);
    } 
}
