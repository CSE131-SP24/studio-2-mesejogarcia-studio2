package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.print("Investment: ");
	double originalStart = in.nextDouble();
	System.out.print("What's the win probability $$$$$$ ");
	double winChance = in.nextDouble();
	System.out.print("What's the win limit? ");
	int winLimit = in.nextInt();
	int day = 0;
	int attempts = 0;
	int number;
	int totalSimulations = 1;
	//for (int totalSimulations = 1; totalSimulations<=100; totalSimulations++);
	while (totalSimulations<=100)
	{
		double startAmount=originalStart;
		attempts = 0;
		day++;
		originalStart=startAmount;
	while ((startAmount<winLimit)&&(startAmount>0))
	{
		attempts++;
		number = (int)(Math.random()*100-1);
		if (number <= winChance*100)
		{
			startAmount++;

		}
		else 
		{
			startAmount--;
		}
	}
	if (startAmount==winLimit)
	{
		System.out.println("Simulation "+day+": "+attempts+" WIN");
	}
	else
	{
		System.out.println("Simulation "+day+": "+attempts+" Big L Bozo");
	}
	
	totalSimulations++;
	}
}
	}

