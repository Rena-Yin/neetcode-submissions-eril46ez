class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for every last n element in array 1, 
        // copy over array 2
        // then do insertion sort

        for (int i = 0; i < n; i++) {
            int cur = nums2[i];
            nums1[m] = cur;
            m++;
        }
        
        insertionSort(nums1, nums1.length);
    }

    private void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] >= key) {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
        }
    }
}