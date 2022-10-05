package ex1;

public class MinMaxExam {

    public static void main(String[] args) {
        int[] nums = {10, 55, 23, 2, 79, 101, 82, 30, 45};

        /* hint ======================================= */
        int min = nums[0];
        int max = nums[0];
        int minPos = 0;
        int maxPos = 0;

        for(int i=1; i<nums.length; i++){

            if(min > nums[i]){
                min = nums[i];
                minPos = i+1;
            }

            if(max < nums[i]){
                max = nums[i];
                maxPos = i+1;
            }
        }

        System.out.println("biggest num: "+ max + ", index: "+ maxPos);
        System.out.println("least num: "+ min + ", index: "+ minPos);
    }
}
