package parcial3;

public class Conexion {
	
	//atributos privados
private	 String nombre;
private int puerto;
private String host;
private String usuario;
private String password;
private String tipo;

//Constantes

protected final static double TAMAÑO = 8.0;

protected final static String PROCESADOR_PARA_WINDOWS = "Intel";

protected final static String PROCESADOR_PARA_LINUX = "amd";

protected final static String SISTEMA_OPERATIVO_PARA_WINDOWS = "windows";

protected final static String SISTEMA_OPERATIVO_PARA_LINUX = "ubuntu";



//constructores con todos

public Conexion(String nombre, int puerto, String host, String usuario, String password, String tipo) {
	
	this.nombre = nombre;
	this.puerto = puerto;
	this.host = host;
	this.usuario = usuario;
	this.password = password;
	this.tipo = tipo;
}




//Constructor con nombre, puerto, tipo, host//


public Conexion(String nombre, int puerto, String host, String tipo) {
	
	this.nombre = nombre;
	this.puerto = puerto;
	this.host = host;
	this.tipo = tipo;
}





//Constructor con password, tipo, nombre y host

public Conexion(String nombre, String host, String password, String tipo) {
	
	this.nombre = nombre;
	this.host = host;
	this.password = password;
	this.tipo = tipo;
}





//Constructor por defecto

public Conexion() {
	super();
}

//Constructor con nombre, host, usuario, password


public Conexion(String host, String usuario, String password) {
	
	
	this.host = host;
	this.usuario = usuario;
	this.password = password;
}



//Metodos Getter y Setters


public String getNombre() {
	return nombre;
}













public void setNombre(String nombre) {
	this.nombre = nombre;
}




public int getPuerto() {
	return puerto;
}




public void setPuerto(int puerto) {
	this.puerto = puerto;
}




public String getHost() {
	return host;
}




public void setHost(String host) {
	this.host = host;
}




public String getUsuario() {
	return usuario;
}




public void setUsuario(String usuario) {
	this.usuario = usuario;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




public String getTipo() {
	return tipo;
}




public void setTipo(String tipo) {
	this.tipo = tipo;
}



















}
