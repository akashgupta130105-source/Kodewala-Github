package com.Kodwala;

public class NameValidatiion implements ILogin {

	@Override
	public boolean validateName(String name) {
		  if (name == null || name.isEmpty()) {
			  
		        return true;
		        
		        
		    }
		  
		    return Character.isUpperCase(name.charAt(0));
		    
		}
		
	

	@Override
	public void validateGmail() {
		System.out.println("NameValidatiion.validateGmail()");
		
	}
	
   

}
