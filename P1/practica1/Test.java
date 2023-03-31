package practica1;


public class Test {

	public static void main (String[]args) {
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];
		
		
		//inicializo
		for(int i = 0; i<estudiantes.length; i++) {
			estudiantes[i] = new Estudiante();
		}
		
		for(int i = 0; i<profesores.length; i++) {
			profesores[i] = new Profesor();
		}
		
		estudiantes[0].setNombre("Mia");
		estudiantes[1].setNombre("Lucia");

		
		for(int i = 0; i<estudiantes.length; i++) {
			//System.out.println(estudiantes[i].TusDatos());
			
		}
	}
}
