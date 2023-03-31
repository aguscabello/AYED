package practica1;

public class Estudiante {
	private String nombre;
	private String apellido;
	private Double comision;
	private String email;
	private String direccion;
	
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
	
	public void setComision(Double comision) {
		this.comision = comision;
	}
	
	public Double getComision() {
		return comision;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getDireccion() {
		return direccion;
	
}
	public String TusDatos() {
		return "Nombre "+getNombre()+" Apellido "+getApellido()+" Comision "+getComision()+" email "
				+getEmail()+" Direccion "+getDireccion();
	}
}
