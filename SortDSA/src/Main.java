public class Main {
    public static void main(String[] args) {

        System.out.println("BubbleSort");
        int nums[] = {16, 7, 2, 6, 9};
        int result[]=BubbleSort(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\nSelection Sort");
        int result2[] = Selectionsort(nums);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println("\nInsertion Sort");
        int result1[] = Insertion(nums);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println("\nquick Sort");
        int result3[] = quick(nums,0,nums.length-1);

        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
        System.out.println("\nMerge Sort");
        int result4[] = merge(nums,0,nums.length-1);

        for (int i = 0; i < result4.length; i++) {
            System.out.print(result4[i] + " ");
        }
    }

    public static int[] merge(int[] nums,int left,int right) {
        if(left<right) {
            int mid = (left + right) / 2;
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            mergesort(nums, left, mid, right);
        }
        return nums;
    }

    private static int[] mergesort(int[] nums, int left, int mid, int right) {

        int larrsize=mid-left+1;
        int rarrsize=right-mid;
        int arr[]=new int[larrsize];
        int barr[]=new int[rarrsize];
        for (int i = 0; i < larrsize; i++) {
            arr[i]=nums[left+i];
        }
        for (int j = 0; j < rarrsize; j++) {
            barr[j]=nums[mid+1+j];
        }
        int x=0,y=0;
        for (int k = left; k <= right; k++) {
            if(x<larrsize && y<rarrsize){
                if(arr[x]<=barr[y]){
                    nums[k]=arr[x];
                    x++;
                }else{
                    nums[k]=barr[y];
                    y++;
                }
            }else if(x<larrsize){
                nums[k]=arr[x];
                x++;
            }else{
                nums[k]=barr[y];
                y++;
            }
        }
        return nums;
    }

    public static int[] quick(int[] nums,int low,int high) {
      if(low<high){
            int pivot=partition(nums,low,high);
            quick(nums,low,pivot-1);
            quick(nums,pivot+1,high);
      }
      return nums;
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot=nums[high];
        int i =low-1;
        for (int j = low; j < high; j++) {
            if(nums[low]<pivot){
                i++;
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return i+1;
    }

    public static int[] Selectionsort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int max = i;
//            System.out.println(max + "  i= " + i);
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    //swap
                    max = j;
                }

            }
//            swap(nums[i], nums[max]);
            int    temp=nums[max];
            nums[max]=nums[i];
            nums[i]=temp;
        }

        return nums;
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int[] BubbleSort(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length - 1 -i; j++) {

                if(nums[j+1]>nums[j]){
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

    public static int[] Insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp =nums[i];
            for (int j = i-1;  j >= 0 && nums[j] > temp; j--) {
                    nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }

        return nums;
    }

}