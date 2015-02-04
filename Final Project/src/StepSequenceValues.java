import java.util.ArrayList;
import java.util.Scanner;
public class StepSequenceValues
	{
		private String StepSequence;
		private double value;
		public StepSequenceValues(String s, double v)
			{
				StepSequence = s;
				value = v;
			}
		public static void StepSequences()
			{
				ArrayList<StepSequenceValues>StepSequence=new ArrayList<StepSequenceValues>();
				StepSequence.add(new StepSequenceValues ("Step Sequence",3.9));
				StepSequence.add(new StepSequenceValues ("Cheorgraphy Step Sequence",2.0));
			}
		public String getStepSequence()
			{
				return StepSequence;
			}
		public void setStepSequence(String stepSequence)
			{
				StepSequence = stepSequence;
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
