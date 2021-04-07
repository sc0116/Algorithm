import java.util.PriorityQueue;
import java.util.Scanner;

public class ClassroomAssignment {
	
	public static void main(String[] args) {
		
		int N, startTime, endTime;
		PriorityQueue<Integer> startTimePQ = new PriorityQueue<>();
		PriorityQueue<Integer> endTimePQ = new PriorityQueue<>();
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			startTime = scan.nextInt();
			startTimePQ.offer(startTime);
			endTime = scan.nextInt();
			endTimePQ.offer(endTime);
		}
		
		while(!startTimePQ.isEmpty()) {
			if(endTimePQ.peek() <= startTimePQ.poll())
				endTimePQ.poll();
		}
		
		System.out.println(endTimePQ.size());
	}
}
