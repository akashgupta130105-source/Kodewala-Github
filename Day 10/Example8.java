public class Example8{
static int  findMax(int[] arr){
	int max = arr[0];
	for (int n : arr){
		if (n>max)max = n;
	}
	return max;
}
public static void main(String[] args){
	int[] number = {4,9,2,7,5};
	System.out.println(findMax(number));
}
}
