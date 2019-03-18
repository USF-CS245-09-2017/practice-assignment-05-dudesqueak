public class QuickSort implements SortingAlgorithm {
    public void sort(int [] a){
         sort(a, 0, a.length);
    }
    public void sort(int [] a, int start, int end){
        if(start < end){
            int i = partition(a, start, end);
            sort(a, start, i);
            sort(a, i+1, end);
        }
    }

    public int partition (int a[], int low, int high)
    {
        int pivot = a[high];

        int i = (low - 1);  // Index of smaller element

        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (a[j] <= pivot)
            {
                i++;    // increment index of smaller element
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp2 = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp2;
        return i + 1;
    }

}
