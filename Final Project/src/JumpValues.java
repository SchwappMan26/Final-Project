import java.util.ArrayList;
import java.util.Scanner;
public class JumpValues
	{
		private String jump;
		private double value;
		public JumpValues(String j, double v)
			{
				jump=j;
				value=v;
			}
		public static void Jumps()
			{
				ArrayList<JumpValues>jumps=new ArrayList<JumpValues>();
				jumps.add(new JumpValues ("2Axel",3.3));
				jumps.add(new JumpValues ("3Salchow",4.2));
				jumps.add(new JumpValues ("3Toe",4.1));
				jumps.add(new JumpValues ("3Loop",5.1));
				jumps.add(new JumpValues ("3Flip",5.3));
				jumps.add(new JumpValues ("3Lutz",6.0));
				jumps.add(new JumpValues ("3Axel",8.5));
				jumps.add(new JumpValues ("4Salchow",10.5));
				jumps.add(new JumpValues ("4Toe",10.3));
				jumps.add(new JumpValues ("4Lutz",13.6));				
			}
		public String getJump()
			{
				return jump;
			}
		public void setJump(String jump)
			{
				this.jump = jump;
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
