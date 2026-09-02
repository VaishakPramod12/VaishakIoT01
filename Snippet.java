package package9;

public class Snippet {
	 public boolean canJump(int[] nums) {
	        // Tracks the absolute farthest index we can reach so far
	        int maxReach = 0; 
	        
	        // Traverse through the array
	        for (int i = 0; i < nums.length; i++) {
	            // If the current index is beyond our max reach, we are stuck
	            if (i > maxReach) {
	                return false;
	            }
	            
	            // Update the farthest index we can reach from the current spot
	            maxReach = Math.max(maxReach, i + nums[i]);
	            
	            // Optimization: If we can already reach the last index, return true early
	            if (maxReach >= nums.length - 1) {
	                return true;
	            }
	        }
	        
	        return true;
	    }
	
	    public static void main(String[] args) {
	        JumpGame game = new JumpGame();
	        
	        int[] case1 = {2, 3, 1, 1, 4};
	        int[] case2 = {3, 2, 1, 0, 4};
	        
	        System.out.println(game.canJump(case1)); // Output: true
	        System.out.println(game.canJump(case2)); // Output: false
	    }
}

