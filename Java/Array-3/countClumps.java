/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */

public int countClumps(int[] nums) {
    int count = 0;
    int [] countArray = new int[nums.length];
    
    int check = 0;
  
    for(int i = 0; i < nums.length-1; i++){
        if(nums[i] == nums[i+1] && check == 0){
        count++;
        check = 1;
        }  
      
      else if(nums[i] != nums[i+1]){
        check = 0;
      }
    
    }
    return count;
  }
  