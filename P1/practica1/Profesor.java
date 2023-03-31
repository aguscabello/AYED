package practica1;

public class Profesor {
	private String nombre;
	private String apellido;
	private String catedra;
	private String email;
	private String facultad;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setCatedra(String catedra) {
		this.catedra = catedra;
		}
	
	public String getCatedra() {
		return catedra;
		}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String getFacultad() {
		return facultad;
	}
	
	public String TusDatos() {
		return "Nombre "+getNombre()+" Apellido "+getApellido()+" Catedra "+getCatedra()+" email "
				+getEmail()+" Facultad "+getFacultad();
	}
}
