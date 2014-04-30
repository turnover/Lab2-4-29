import java.util.Random;
public class RandomGenerator 
{
	Random random = new Random();
	public int num1;
	public int num2;
	public int rolls;
	
	public int Throw()
	{
		num1 = random.nextInt(6)+1;
		return num1;
	}
	public int Value()
	{
		return num1;
	}
	public int Throw(int Bounces)
	{
		rolls=Bounces;
		do
		{
			num1 = num2 +random.nextInt(6)+1;
			Bounces--;
		}
		while (Bounces>0);
		
		num1 = num1/rolls;
		return num1;
	}
	
}

