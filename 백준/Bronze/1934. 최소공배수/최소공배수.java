import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		
		for(int i = 0; i < N; i++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			int d = gcd(a, b);	// 최소 공배수
			
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
		
	}
    
    
	// 최대공약수
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b;
            
			a = b;
			b = r;
		}
		return a;
	}
}