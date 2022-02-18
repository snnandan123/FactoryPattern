package com.te.factory;

public class AppUsingFactory {
	public AppUsing getInstance(String str){
		if(str.equalsIgnoreCase("kish"))
		return new Kishan();
		else if(str.equalsIgnoreCase("souj"))
			return new Soujanya();
		else if(str.equalsIgnoreCase("jeru"))
			return new JerushaN();
		else if(str.equalsIgnoreCase("savn"))
			return new Savanth();
		else return null;
		
	}
}
