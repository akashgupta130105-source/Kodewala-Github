class Add{
public static void main(String args[])
{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum = Add.sum(a,b);
	System.out.println("Addition to number :"+ sum);
}
static int sum(int a,  int b){
	 
	return a+b;
}
}
	