public class Test {
public static void findClosestPair(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " +diff);
        int resLeft = 0, resRight = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            boolean flag = Math.abs(x - sum) < diff;
            System.out.println("flag " +flag);
            System.out.println("Math.abs(x - sum) " +Math.abs(x - sum));
            if (flag) {
                resLeft = arr[left];
                resRight = arr[right];
                diff = Math.abs(x - sum);
            }

            // Move pointers
            if (sum > x)
                right--;
            else
                left++;
        }

        System.out.println("The closest pair is: " + resLeft + " and " + resRight);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 49}; // Make sure 30 is in the array
        int x = 54;

        findClosestPair(arr, x);
    }
}