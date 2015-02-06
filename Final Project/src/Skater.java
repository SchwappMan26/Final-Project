
import java.util.Scanner;
public class Skater
	{
		static Scanner userInput = new Scanner(System.in);
		static int jump;
		static int spin;
		static int StepSequence;
			{
				AskSkaterName();
				AskForElements();
			}
			public static void AskSkaterName()
				{
					System.out.println("Dear Skater, what is your name?");
					String name = userInput.nextLine();
					System.out.println("Introducing from Denver Colorado " + name);
					System.out.println("Good luck");
					System.out.println("You are allowed 8 jumps, 3 spins, and 2 Step Sequences");
				}
			public static int AskForElements()
				{
					System.out.println("What are your elements?");
					System.out.println("(1)Jump, (2)Spin, or (3)step sequence?");
					int element = userInput.nextInt();
					if (element==1)
						{
							System.out.println("(1)2Axel, (2)3Salchow, (3)3Toe, (4)3Loop, (5)3Flip, (6)3Lutz, (7)3Axel, (8)4Salchow, (9)4Toe, (10)4Lutz");
							jump = userInput.nextInt();	
							return jump;
						}
					else if (element==2)
						{
							System.out.println("(1)Combo Spin, (2)Flying sit, (3)flying camel, (4)Change foot sit, (5)Change foot camel");
							spin = userInput.nextInt();
							return spin;
						}
					else if(element==3)
						{
							System.out.println("(1)Step Sequence, (2)choreograph step sequence");
							StepSequence = userInput.nextInt();
							return StepSequence;
						}
					return element;
				}
	}