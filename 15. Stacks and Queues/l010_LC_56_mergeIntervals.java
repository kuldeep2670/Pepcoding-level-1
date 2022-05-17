// 56. Merge Intervals

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
// and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
import java.util.*;
public class l010_LC_56_mergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->{
            return a[0] - b[0];
        });
        Stack<int []> st = new Stack<>();
        st.push(intervals[0]);
        
        for(int i = 1; i<intervals.length;i++){
            int[] t = st.pop();
            int s1 = t[0];
            int e1 = t[1];
            
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            
            int em = Math.max(e1,e2);
            
            //merge condition
            if(s2 <= e1){
                int [] merge = {s1, em};
                st.push(merge);
                //st.push(new int[]{s1,em}); //above two lines in one line
            }
            else{
                st.push(t);
                st.push(intervals[i]);
            }
            
        }
        int [][] ans = new int[st.size()][2];
        for(int i = ans.length-1; i>=0;i--){
            int [] tmp = st.pop();
            ans[i][0] = tmp[0];
            ans[i][1] = tmp[1];
        }
        return ans;
    }
}
