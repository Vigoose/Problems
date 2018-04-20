/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 * Given a collection of intervals, merge all overlapping intervals.
    Example 1:
    Input: [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    round 1: start: 1, end = 3
    round 2: start: 1, end = 6
    round 3: interval[2]: start: 8, end = 10
    round 4: 
    
 */

class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0){
            return intervals;
        }
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> res = new ArrayList<Interval>();
        Collections.sort(intervals, (a,b) -> (a.start - b.start));
        for (Interval interval : intervals){
            if (interval.start <= end){
                end = Math.max(end, interval.end);
            }else{
                res.add(new Interval (start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        res.add(new Interval (start, end));
        return res;
    }
}
