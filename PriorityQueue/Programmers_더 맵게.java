import java.util.PriorityQueue;

public class Scoville {

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		int firstMin, secondMin, mix;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int scovilleList : scoville) {

			queue.offer(scovilleList);
		}

		while (queue.peek() < K) {
			if (queue.size() < 2) {

				return -1;
			}

			firstMin = queue.poll();
			secondMin = queue.poll();
			mix = firstMin + secondMin * 2;

			queue.offer(mix);
			answer++;
		}

		return answer;
	}

}
