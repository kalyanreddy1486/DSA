class Solution {
    public int countStudents(int[] x, int[] y) {
        Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q1 = new LinkedList<>();
		for(int i = 0 ; i<x.length ; i++) {
			q.offer(x[i]);
			q1.offer(y[i]);
			
		}
		int size = 0;
		
		while(!q.isEmpty()) {
			if(size == q.size()) {
				return q.size();

				
			}
			int p = q.poll();
			if(p == q1.peek()) {
				q1.poll();
				size = 0;
			}
			else {
				q.offer(p);
				size++;
				
			}
		}
        return 0;
        
    }
}