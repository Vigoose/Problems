   public int minMeetingRooms(List<Interval> intervals) {
            int[] starts = new int[intervals.size()];
            int[] ends = new int[intervals.size()];
            for (int i = 0; i < intervals.size(); i++){
                starts[i] = intervals.get(i).start;
                ends[i] = intervals.get(i).end;
            }
            Arrays.sort(starts);
            Arrays.sort(ends);
            int res = 0;
            int end = 0;
            for (int i = 0; i < intervals.size(); i++){
                if (starts[i] < ends[end]){
                    res++;
                }else{
                    end++;
                }
            }
            return res;

            // Write your code here
        }
