public class Main {
    public static void main(String[] args) {

        System.out.println("LinearSerach Algorithm");
//        int nums[]= {23,45,12,67,34,89,90};
        int nums[]= {12,23,34,45,67,89,90};
        int target=34;
        int result=BinarySearch(nums,target);
        if(result ==-1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: "+result);
        }

    }

    public static int LinearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                return i;
            }
        }

        return -1;
    }
    public static int BinarySearch(int[] nums, int target) {
        int size=nums.length;
        int start=0;
        int end=size-1;
        while(start<=end) {
            int mid = (start + end )/ 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }



        return -1;
    }
}