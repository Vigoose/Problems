class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[] res = new int[numCourses];
        int k = 0;
        for (int[] paris : prerequisites){
            indegree[paris[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < indegree.length; i++){
            if (indegree[i] == 0) {
                queue.offer(i);
                res[k++] = i;
            }
        }
        
        while (!queue.isEmpty()){
            int pre = queue.poll();
            for (int[] paris : prerequisites){
                if(paris[1] == pre){
                    indegree[paris[0]]--;
                if (indegree[paris[0]] == 0){
                    queue.offer(paris[0]);
                    res[k++] = paris[0];
                }
                }
            }
        }
        return k == numCourses? res: new int[0];
    }
}
