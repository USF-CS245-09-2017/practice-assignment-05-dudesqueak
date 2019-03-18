public class MergeSort implements SortingAlgorithm {
    public void sort(int [] a){
        sort(a, 0, a.length);
    }
    public void sort(int [] a, int start, int end){
        if(start < end -1){
            int middle = (end + start)/2;
            sort(a, start, middle);
            sort(a, middle, end);
            merge(a, start, middle, end);
        }
    }
    public void merge(int[] arr, int l, int m, int r) {
        int leftfinger = l;
        int rightfinger = m;
        int[] newarr = new int[r-l];
        int index = 0;
        while (leftfinger < m && rightfinger <  r) {
            if (arr[leftfinger] < arr[rightfinger]) {
                newarr[index] = arr[leftfinger];
                index++;
                leftfinger++;
            } else {
                newarr[index] = arr[rightfinger];
                index++;
                rightfinger++;
            }
        }
        while (leftfinger < m) {
            newarr[index] = arr[leftfinger];
            index++;
            leftfinger++;
        }
        while (rightfinger < r) {
            newarr[index] = arr[rightfinger];
            index++;
            rightfinger++;
        }

        for (int i=0; i<newarr.length; i++) {
            arr[l+i] = newarr[i];
        }

    }

}
