package TopInterview150.ArrayAndString;

public class _80 {
    public static void main(String[] args) {

    }
    // my solution
    static public int removeDuplicates(int[] nums) {
        int i =0;
        int k = 0;
        int count = 0;
        while(i<nums.length){
            if(i== nums.length-1 ){
                if(count < 2) {
                    nums[k] = nums[i];
                    k++;
                }
                break;
            }
            if(nums[i] == nums[i+1]){
                if(count < 2){
                    count++;
                    nums[k] = nums[i];
                    k++;
                }
                i++;
            }else{
                if(count < 2){
                    nums[k] = nums[i];
                    k++;
                }
                i++;
                count = 0;
            }
        }

        return k;
    }
    // chat gpt
    public int removeDuplicates2(int[] nums) {

        int slow = 0; // slow pointer to track the position for inserting unique elements
        int count = 1; // count of occurrences of current element
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[slow]) {
                if (count < 2) {
                    nums[++slow] = nums[fast]; // Only move slow pointer when count is less than 2
                }
                count++;
            } else {
                nums[++slow] = nums[fast]; // Move slow pointer and copy unique element
                count = 1; // Reset count for the new element
            }
        }
        return slow + 1; // return the length of the modified array
    }
}
