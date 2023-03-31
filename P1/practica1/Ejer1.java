package practica1;

public class Ejer1{
	


public static void imp1(int a, int b)
{
	for(int i = a; i<= b; i++)
		{
			System.out.println(i);
		}
}

public static void imp2(int a, int b)
{
	while (a<=b)
		{
		  System.out.println(a);
		  a++;
		}
}


public static void imp3(int a,int b)
{
	if(a<=b)
	{
		System.out.println(a);
		imp3(a++,b);
	}
}



public static void main (String[]args) {
	int a = 3;
	int b = 10;
	imp1(a,b);
	 a = 1;
	imp2(a,b);
	imp3(a,b);
}

	
	
	
}