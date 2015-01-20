package com.ahcobos.greencore.utils;

public class GCColorManager{
	
	public static String getHexColorNotation(int r, int g, int b){
		String hexr = r<15?"0"+Integer.toHexString(r):Integer.toHexString(r);		
		String hexg = g<15?"0"+Integer.toHexString(g):Integer.toHexString(g);
		String hexb = b<15?"0"+Integer.toHexString(b):Integer.toHexString(b);	
	
		return hexr+hexg+hexb;
	}	
}
