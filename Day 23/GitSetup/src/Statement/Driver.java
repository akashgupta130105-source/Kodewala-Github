package Statement;
public class  Driver{
public static void main(String [] args) {
	Driver state =new Driver();
	
	
	int day= Integer.parseInt(args[0]);
	 state.SwitchStatement(day);
}
	

public void SwitchStatement (int number){
	switch(number) {
	case 1:
		System.out.println("Mon");
		break;
	case 2:
		System.out.println("Tue");
		break;
	case 3:
		System.out.println("Wed");
		break;
	case 4:
		System.out.println("Thu");
		break;
	case 5:
		System.out.println("Fri");
		break;
	case 6:
		System.out.println("Sut");
		break;
	case 7:
		System.out.println("Sun");
		break;
		default:
			System.out.println("Unknown");
			break;
	}
}
}

