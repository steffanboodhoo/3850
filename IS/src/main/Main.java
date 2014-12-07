package main;

import globals.Attributes.Colour;

import java.util.ArrayList;
import java.util.Scanner;

import objects.Cheese;

public class Main {
	public static ArrayList<Cheese> cheeses;
	public static int total=0;
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the ")
		String response=in.nextLine();
		if(response.equals(Colour.blue.toString()))
			System.out.println("it workd");
		String[] values=response.split(" ");
	}
}
