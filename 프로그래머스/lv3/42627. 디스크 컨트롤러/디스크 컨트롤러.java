import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Process {
	int rt;
	int wt;

	public Process(int rt, int wt) {
		this.rt = rt;
		this.wt = wt;
	}
}

class Solution {
    public int solution(int[][] jobs) {
        LinkedList<Process> waiting = new LinkedList<>();

		PriorityQueue<Process> pq = new PriorityQueue<>(new Comparator<Process>() {
			public int compare(Process p1, Process p2) {
				return p1.wt - p2.wt;
			}
		});

		for (int[] job : jobs) {
			waiting.offer(new Process(job[0], job[1]));
		}

		Collections.sort(waiting, new Comparator<Process>() {
			public int compare(Process p1, Process p2) {
				return p1.rt - p2.rt;
			}
		});

		int answer = 0;
		int cnt = 0;
		int time = waiting.peek().rt;

		while (cnt < jobs.length) {
			while (!waiting.isEmpty() && waiting.peek().rt <= time) {
				pq.offer(waiting.pollFirst());
			}

			if (!pq.isEmpty()) {
				Process process = pq.poll();
				time += process.wt;
				answer += time - process.rt;
				cnt++;
			} else {
				time++;
			}
		}

		answer /= cnt;
        
        return answer;
    }
}