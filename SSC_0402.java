package priority;

import java.util.PriorityQueue;

public class PriorityTest {

	static int shake(int [] scoville, int K) {
		int count = 0;
		int n1, n2, temp = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < scoville.length; i++) {
			
			queue.offer(scoville[i]);
		}
		
		while(queue.peek() < K) {
			
			if(queue.size() < 2) {
				
				return -1;
			}
			
			n1 = queue.poll();
			n2 = queue.poll();
			temp = n1 + n2 * 2;
			
			queue.offer(temp);
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {

		int[] scoville = {1, 2, 3, 9, 10, 12};
		
		int K = 7;
		
		System.out.println("È½¼ö: " + shake(scoville, K));
	}

}
