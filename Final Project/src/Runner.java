
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
						Skater.AskForElements();
						Routine.YourRoutine();
					}
				
			}

	}