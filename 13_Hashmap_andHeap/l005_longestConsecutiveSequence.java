import java.util.*;
public class l005_longestConsecutiveSequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        //Step 1 create hashmap
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int ele: arr){
            hm.put(ele, true);
        }

        //Step 2 potential starting point
        for(int ele: arr){
            if(hm.containsKey(ele -1))
                hm.put(ele, false);
        }

        //Step 3 check for longest sequence
        int maxLen = 0;
        int maxStPt = 0;

        for(int ele: arr){
            if(hm.get(ele) == true){
                int tempLen = 1;
                int tempStPt = ele;

                while(hm.containsKey(tempStPt + tempLen)){
                    tempLen++;
                }

                if(tempLen > maxLen){
                    maxLen = tempLen;
                    maxStPt = tempStPt;
                }
            }
        }

        for(int i = maxStPt; i < maxStPt + maxLen; i++){
            System.out.println(i);
        }

        scn.close();
    }
}
