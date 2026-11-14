public class Example7{
int value ;
Example7(int value){this.value= value;}
int doubleIt(){return value *2;}
public static void main(String []args){
	Example7 obj =new Example7(10);
	System.out.println(obj.doubleIt());
}
}