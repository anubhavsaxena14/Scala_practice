object Assignment2{
	def main(args: Array[String]){
    var arr = new Array[Int](10);
    var int:n = sizeof(arr);
 
    insertionSort(arr, n);
    printArray(arr, n);
 
    return 0;
	}
	def insertionSort(int arr[], int n): Int = {
   	var int:i, key, j;
   	var arr2 = new Array[Int](10);
   	arr2 = arr;
   	for (i = 1; i < n; i++)
   	{
        key = arr[i];
       	j = i-1;
        while (j >= 0 && arr[j] > key)
        {
           arr[j+1] = arr[j];
           j = j-1;
        }
        arr[j+1] = key;
    }
	}
	def printArray(int arr[], int n): Int = {
    int i;
    for (i=0; i < n; i++)
       printf("%d ", arr[i]);
       printf("\n");
	}
}
