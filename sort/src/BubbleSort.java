
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,17,13,12,11,15};
		System.out.print("√∞≈›≈≈–Ú«∞£∫");
		printArray(arr);
		bubbleSort(arr);
		System.out.print("√∞≈›≈≈–Ú∫Û£∫");
		printArray(arr);
		
	}
	public static void printArray(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static void bubbleSort(int [] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("µ⁄"+(i+1)+"¬÷≈≈–Ú∫Û£∫");
			printArray(arr);
		}
	}

}
