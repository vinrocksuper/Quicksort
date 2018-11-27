public class Quicksort {
    public static void quicksort(int[] arr,int l, int r)
    {
        if(l<r)
        {
            int pivot =  partition(arr,l,r);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,r);
        }
    
    }
    public static int partition(int[] arr, int l, int r)
    {
        int pivot = arr[r];
        int i=l-1;
        for(int j=l;j<r;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
}
    

