package com.array;

public class Balance {
	public static void main(String []args) {
		SBIBank sb1= new SBIBank("Akash", 201,9104);
		SBIBank sb2= new SBIBank("Prakash", 2025,9103);
		SBIBank sb3= new SBIBank("Vikash", 2005,9105);
		SBIBank sb4= new SBIBank("Akash", 201,9106);
		
		SBIBank sb[]= new SBIBank[4];
		
		sb[0]=sb1;
		sb[1]=sb2;
		sb[2]=sb3;
		sb[3]=sb4;
		
//		for(int =0, index < SBIBank.length; index++) {
//			if(SBIBank[index].startswith(""))
		
//		for (int i = 0; i < sb.length; i++) {
//			if (sb[i].acccountBalance < 2000) {
//				System.out.println(sb[i].customerName + " | Balance: " + sb[i].acccountBalance
//						+ " | Mobile: " + sb[i].mobileNumber);
//		}
//		
//		
//		
//	}
		
		int i = 0;
		while (  i<sb.length) {
			if(sb[i].acccountBalance>2000) {
				System.out.println(sb[i].customerName+"Balance" + sb[i].acccountBalance+" Mobile :" + sb[i].mobileNumber);
			} 
			i++;
		break;
		}
		
	
	
	

	}
}
