
package ex51;
import java.util.*;
public class Ex51 {
public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
            return 0;
        }

        int answer = 0;
        int cntConsecutive = 1;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    cntConsecutive++;
                } else {
                    answer = Math.max(answer, cntConsecutive);
                    cntConsecutive = 1;
                }
            }
        }

        return Math.max(answer, cntConsecutive);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex51 solution = new Ex51();
        
        // Example input
        int[] nums = {100, 4, 200, 1, 3, 2,-1,0};
        
        int result = solution.longestConsecutive(nums);
        
        System.out.println("Longest consecutive sequence length: " + result);
    
    }
    
}
