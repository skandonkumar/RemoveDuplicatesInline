public class Solution {
	public static int[] removeDuplicates(int[] nums) {
        int i=1;
        int num = nums[0];
        for(int j=0; j<nums.length; j++){
            if(nums[j] != num){
                nums[i] = nums[j];
                num = nums[j];
                i++;
            }
        }
        return nums;
    }
	
	public static void main(String args[]) {
		int[] a = {1,1,2,2,2,3,3,4,4,4,4,4,5};
		a = removeDuplicates(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"");
		}
	}
}
