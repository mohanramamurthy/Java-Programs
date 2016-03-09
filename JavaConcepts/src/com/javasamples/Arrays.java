package com.javasamples;

public class Arrays {

	public static void main (String[] args){
		int[] array= new int[10];
		array[0]=100;
		array[1]=200;
		array[4]=80;
		for(int i=0; i<array.length; i++)
		{
			//System.out.println(array[i]);
		}
		
		String [] arrayst=new String[10];
		arrayst[0]="hi";
		arrayst[1]="hello";	
		//arraystring(arrayst);
		
		
		String [][] ddarrayst=new String[3][4];
		ddarrayst[0][1]="01";
		ddarrayst[0][2]="02";	
		ddarrayst[1][1]="11";
		ddarrayst[1][2]="12";
		ddarraystring(ddarrayst);
		
		System.out.println("Rows = "+ddarrayst.length);
		System.out.println("Column1 = "+ddarrayst[0].length);
	}
	
	public static void arraystring(String[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	public static void ddarraystring(String[][] a)
	
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i;j<=i;j++)
			{
			System.out.println(a[i][j]);
				//System.out.println(a[0][1]);
			}
		}
	}
}
