class AddTo{
public static void main(String []args)
{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum = AddTo.sum(a ,b);
	System.out.println(sum);
	
	

}
static int sum(int a,int b){
	//System.out.println(sum);
	return a+b;
}
}