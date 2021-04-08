import java.util.PriorityQueue;
import java.util.Scanner;

public class CardSort {

	public static void main(String[] args) {

		int N;
		long firstMin, secondMin, sum = 0;
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			pq.offer(scan.nextLong());
		}
		
		while(pq.size() > 1) {
			firstMin = pq.poll();
			secondMin = pq.poll();
			sum += firstMin + secondMin;
			pq.offer(firstMin + secondMin);
		}
		
		System.out.println(sum);
		
	}

}
