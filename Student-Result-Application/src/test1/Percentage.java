package test1;

public class Percentage {
	public String result(float per, boolean p) {
		if(p)
		{
			return "'Fail";
		}
		else if(per>=70 && per<=100)
		{
		    return "Distiction";
		}
		else if(per>=60 && per<70)
		{
			return "FirstClass";
		}
		else if(per>=50 && per<60)
		{
			return "SecondClass";
		}
		else if(per>=35 && per<50)
		{
			return "ThirdClass";
		}
		else
		{
			return "Fail";
		}
	}

}
