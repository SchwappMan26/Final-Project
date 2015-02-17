
public class Runner
	{
		static int jumps=0;
		static int spins=0;
		static int stepSequence=0;
		static int elements=0;
		public static boolean skateContinues=true;
		public static void main(String[] args)
			{			
				Skater.AskSkaterName();
				while (skateContinues) 
					{
						System.out.println(" ");
						Skater.AskForElements();
						if (Skater.element==1)
							{
								jumps++;
							}
						else if (Skater.element==2)
							{
								spins++;
							}
						else if (Skater.element==3)
							{
								stepSequence++;
							}
						Routine.YourRoutine();
						System.out.println("Elements: ");
						System.out.println(" ");
						Routine.printList();
						System.out.println(" ");
						System.out.println("Number of Jumps Completed: "+jumps );
						System.out.println("Number of Spins completed: "+spins );
						System.out.println("Number of Step Sequences Completed: "+stepSequence);
						elements++;
						System.out.println("Number of total elements completed: "+elements);
						if (elements==13)
							{
								System.out.println(" ");
								Routine.finalPrintList();
								System.out.println(Skater.name+ " is currently in 1st Place");
								skateContinues=false;
							}
					}	
			}
	}