class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        int res = numCourses;
        for (int[] course : prerequisites){
            inDegree[course[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++){
            if (inDegree[i] == 0) queue.offer(i);
        }
        
        while (!queue.isEmpty()){
            int preCourse = queue.poll();
            res--;
            for (int[] course : prerequisites){
                if (course[1] == preCourse){
                    inDegree[course[0]]--;
                    if (inDegree[course[0]] == 0) queue.offer(course[0]);
                }
            } 
            
        }
        return res == 0;
    }
}
