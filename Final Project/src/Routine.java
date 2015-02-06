import java.util.ArrayList;
public class Routine
	{
		static ArrayList<Routine>yourRoutine=new ArrayList<Routine>();
		private String element;
		private double value;
		public Routine(String e, double v)
			{
				element=e;
				value=v;
			}
		public static void YourRoutine()
			{			
				if (Skater.jump==1)
					{
						yourRoutine.add(new Routine ("2Axel",3.3));
					}
				if(Skater.jump==2)
					{
						yourRoutine.add(new Routine ("3Salchow",4.2));
					}
				if(Skater.jump==3)
					{
						yourRoutine.add(new Routine ("3Toe",4.1));
					}
				if(Skater.jump==4)
					{
						yourRoutine.add(new Routine ("3Loop",5.1));
					}
				if(Skater.jump==5)
					{
						yourRoutine.add(new Routine ("3Flip",5.3));
					}
				if (Skater.jump==6)
					{
						yourRoutine.add(new Routine ("3Lutz",6.0));
					}
				if (Skater.jump==7)
					{
						yourRoutine.add(new Routine ("3Axel",8.5));
					}
				if (Skater.jump==8)
					{
						yourRoutine.add(new Routine ("4Salchow",10.5));
					}
				if (Skater.jump==9)
					{
						yourRoutine.add(new Routine ("4Toe",10.3));
					}
				if (Skater.jump==10)
					{
						yourRoutine.add(new Routine ("4Lutz",13.6));	
					}
				if (Skater.spin==1)
					{
						yourRoutine.add(new Routine ("Combination Spin",3.5));
					}
				if (Skater.spin==2)
					{
						yourRoutine.add(new Routine ("Flying Sit",3.0));
					}
				if (Skater.spin==3)
					{
						yourRoutine.add(new Routine ("Flying Camel",3.2));
					}
				if (Skater.spin==4)
					{
						yourRoutine.add(new Routine ("Change foot Sit",3.0));
					}
				if (Skater.spin==5)
					{
						yourRoutine.add(new Routine ("Change foot Camel",3.2));
					}
				if (Skater.StepSequence==1)
					{
						yourRoutine.add(new Routine ("Step Sequence",3.9));
					}
				if (Skater.StepSequence==2)
					{
						yourRoutine.add(new Routine ("Cheorgraphy Step Sequence",2.0));
					}	
			}
			public static void printList()
				{
					for (Routine e : yourRoutine)
						{
							System.out.println("Element: "+e.getElement()+e.getValue());
							System.out.println(" ");
							}
					}
			
		public String getElement()
			{
				return element;
			}
		public void setElement(String element)
			{
				this.element = element;
			}
		public double getValue()
			{
				return value;
			}
		public void setValue(double value)
			{
				this.value = value;
			}
	}