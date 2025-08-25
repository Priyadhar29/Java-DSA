package Project;

public class sort_012{

	public static void main(String[] args) {
		int[]arr= {1,0,2,2,0,1,2,0,0};
		int low=0,mid=1,high=arr.length-1;
		for(int i=0;i<=arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		while(mid<=high) {
			int i=0;
		if(arr[i]==0) {
            // Swap arr[low] and arr[mid]
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
		}
		else if(arr[i]==0) {
            mid++;
		}
		else {
            // Swap arr[mid] and arr[high]
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
		}
		
		//System.out.print(arr[i]+" ");
		for (int num : arr) {
            System.out.print(num + " ");
        }
	}
		
	
		
	}
}
