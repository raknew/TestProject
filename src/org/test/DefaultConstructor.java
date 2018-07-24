package org.test;

public class DefaultConstructor {

	int i,j;
	
	public DefaultConstructor()
	{
		System.out.println("I am in DefaultConstructor()");
		
	}
	
	public DefaultConstructor(int num)
	{
		i=num;
	}
	
	public void Print()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
		
	}
	
	
	
	public static void main(String[] args){
	
		System.out.println(args);
		DefaultConstructor obj = new DefaultConstructor(5);
		obj.Print();
		System.out.println(obj);
		
	}
	
}
