class AddTo{
public static void main(String []args)
{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum = AddTo.sum(a ,b);
	

}
static int sum(int a,int b){
	System.out.println(a+b);
	return;
}
}