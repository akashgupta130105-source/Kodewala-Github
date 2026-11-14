class ANDOperators{
public static void main(String args[]){
int minAge = 18;
int maxage = 60;
int userAge = Integer.parseInt(args[1]);
String name = args[0];
System.out.println("Applying DL " + name);

System.out.println("Allowed to apply for DL:" +((minAge<userAge)&&(maxage>userAge)));
}
}