import java.util.Arrays;
class InsertionSort 
{
	public static void main(String[] args) 
	{
		int arr[]={6,7,4,3,1,5};
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("After Sorting:"+Arrays.toString(arr));
	}
}
