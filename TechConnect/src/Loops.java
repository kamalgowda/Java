class Loops {
	public static void main(String[] args) {

		//if,if else,if else if Condition

		int a=10;

		if(a==12)
		{
			System.out.println("First");
		}
		else if(a==11)
		{
			System.out.println("Second");
		}
		else if(a==10)
		{
			System.out.println("Three");
		}
		else
		{
			System.out.println("None");
		}

		//while Loop

		int c=1;
		int b=123;

		while(c<=10)
		{
			System.out.print(c+" "+b+" ");
			c++;
			b--;
		}
		System.out.println();

		//do While Loop

		int d=1;
		do
		{
			System.out.print(d+" ");
			d++;
		}while(d<10);
		System.out.println();

		//for,nested for Loop

		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}