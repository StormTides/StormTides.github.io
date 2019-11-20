import java.util.Arrays;


public class InsertSort {

	public static void main(String[] args) {
		int[] arr={12,17,13,12,11,15};
        int temp;
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]>arr[i]){
				temp=arr[i];
				for(int j=i;j>=0;j--){
					if(j>0&&temp<arr[j-1]){
						arr[j]=arr[j-1];
					}else{
						arr[j]=temp;
						break;
					}
				}
			}
			System.out.print("µÚ" + i + "ÅÅÐò£º");
            System.out.println(Arrays.toString(arr));
		}
		System.out.print("×îÖÕÅÅÐò£º");
        System.out.print(Arrays.toString(arr));
	}

}
