class HelloWorld{
public static void main(String[] args)
{
System.out.println("HelloWorld");
}}

class AddTwo{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
		System.out.println(a+b);
}}

class SwapTwo{
	public static void main(String[] args){
		int a = 2 , b = 5;
		System.out.println("Before swapping: a = "+a+", b = "+b);
		int temp = a;
		a=b;
		b= temp;
		System.out.println("After Swapping: a="+a+",b="+b);
	}
}

class Boolean{
	public static void main(String[] args){
		boolean isJavaFun =true;
		boolean isFishTasty =false;
		System.out.println("Is Java Fun? " +isJavaFun);
		System.out.println("Is Fish tasty? " +isFishTasty);
    }
}

class Hyte{
	public static void main(String[] args){
		byte age = 25;
		byte temperature = -10;
		System.out.println("Age:" +age);
		System.out.println("Temperature:"+ temperature);
    }
}

class Short{
	public static void main(String[] args){
		short students =1000;
		short temp = -200;
		System.out.println("Number's of student:" + students);
		System.out.println("Temperature:" + temp);
	}
}

class Integer{
	public static void main(String[] args){
	int population = 2000000;
	int distance = 150000000;
	System.out.println("Population:" + population);
	System.out.println("Distance:" + distance);
    }
}

class Long{
	public static void main(String[] args){
		long worldPopulation = 7800000000L;
		long lightYears = 9460730472580800L;
		System.out.println("WorldPopulation: "+worldPopulation);
		System.out.println("LightYears: " +lightYears);
}
}

class Float{
	public static void main(String[] args){
		float pi = 3.14f;
		float gravity = 9.81f;
		System.out.println("Pi: " +pi);
		System.out.println("Gravity: " + gravity);
	}
}