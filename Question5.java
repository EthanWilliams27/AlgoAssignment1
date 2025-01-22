public class Question5 {

    public static void main(String[] args) {
        int []nums = {5,4,3,5,6,8,6};
        int val= 6;
        int k = 0;
// For loop that iterates through the array, and checks if the val is equal to nums[i]
        // if its not equal then it adds to my counter, showing how many values are not equal to my val
        for(int i=0; i<nums.length;i++){
            if(nums[i] != val){
                k++;
            }
        }
        System.out.println(k);
    }
}
