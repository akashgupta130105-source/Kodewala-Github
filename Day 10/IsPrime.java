public class IsPrime{
static boolean isPrime(int n){
	return n % n == 0 ;
}
public static void main(String []args){
	System.out.println(isPrime(8));
}
}