import java.util.ArrayList;
import java.util.Scanner;	
public class SpinValues
	{
			private String spin;
			private double value;
			public SpinValues(String s, double v)
				{
					spin=s;
					value=v;
				}
			public static void Spins()
				{
					ArrayList<SpinValues>spins=new ArrayList<SpinValues>();
					spins.add(new SpinValues ("Combination Spin",3.5));
					spins.add(new SpinValues ("Flying Sit",3.0));
					spins.add(new SpinValues ("Flying Camel",3.2));
					spins.add(new SpinValues ("Change foot Sit",3.0));
					spins.add(new SpinValues ("Change foot Camel",3.2));
				}
			public String getSpin()
				{
					return spin;
				}
			public void setSpin(String spin)
				{
					this.spin = spin;
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
