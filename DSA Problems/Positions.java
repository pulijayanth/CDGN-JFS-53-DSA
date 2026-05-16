import java.util.*;

class Positions {

    public static int[] SearchRange(int[] arr, int target) {
        int first = findIndex(arr, target, true);
        int last = findIndex(arr, target, false);
        return new int[]{first, last};
    }

    public static int findIndex(int[] arr, int target, boolean isFirst) {

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;

                if (isFirst) {
                    right = mid - 1;   // go left
                } else {
                    left = mid + 1;    // go right
                }
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int result[] = SearchRange(arr, 7);
        System.out.println(Arrays.toString(result));
    }
}
