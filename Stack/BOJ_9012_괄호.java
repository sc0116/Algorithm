import java.util.Scanner;
import java.util.Stack;

public class VPS {

	static boolean solution(String str) {
		Stack<Character> vps = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				vps.push(str.charAt(i));
			}
			else {
				if(vps.empty())
					return false;
				else 
					vps.pop();
			}
		}

		return vps.empty();
		
	}
	
	public static void main(String[] args) {

		int N;
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			String str = scan.next();
			
			if(solution(str))
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
