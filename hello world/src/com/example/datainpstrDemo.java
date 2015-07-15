package com.example;
import java.io.*;

public class datainpstrDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		String str;
		try
		{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter your string--");
		str=dis.readLine();
		System.out.println("Hello"+"\t"+str);
		}
		catch(Exception eoex)
		{
			System.out.println("Error");
		}
	}

}
