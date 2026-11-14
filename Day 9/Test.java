class Test{
void dispose(){
System.out.println("disposing");
}
Test t=new Test();
public static void main(String[] args){
 t.dispose();
}
}