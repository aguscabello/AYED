import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos
{
	public static void main(String[]args)
	{
		ListaDeEnterosConArreglos obj = new ListaDeEnterosConArreglos();
		
		if(arg.lenght == 0)
		{
			System.out.println("El programa no tiene argumentos");
			
		}
		else if (args.length == 1) {
			int num = 0;
			Integer numero;
			while(num < args.length)
			{
				numero = Integer.parseInt(args[num]); //elemento para agregar a list
				num++;//paso a la otra pos
				obj.AgregarFinal(numero);
			}
		}
	}
}