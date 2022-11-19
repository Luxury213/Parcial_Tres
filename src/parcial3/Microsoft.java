package parcial3;
//Aqui tambien hago uso de la herencia y del polimorfismo usando la palabra implements//

public class Microsoft extends Conexion implements OperacionesConexion {
	
	//atributos privados//
	
private boolean isCloud;
private String lenguajeconsultaorm;

//Constante

protected final static int PETICIONES_CONCURRENTES = 1500;


//Constructores 


public Microsoft(String nombre, int puerto, String host, String usuario, String password, String tipo, boolean isCloud,
		String lenguajeconsultaorm) {
	super(nombre, puerto, host, usuario, password, tipo);
	this.isCloud = isCloud;
	this.lenguajeconsultaorm = lenguajeconsultaorm;
}




//Constructor vacio//


public Microsoft(String nombre, int puerto, String host, String usuario, String password, String tipo) {
	super(nombre, puerto, host, usuario, password, tipo);
}






//Getters & Setters//

public Microsoft() {
	// TODO Auto-generated constructor stub
}




public boolean isCloud() {
	return isCloud;
}




public void setCloud(boolean isCloud) {
	this.isCloud = isCloud;
}




public String getLenguajeconsultaorm() {
	return lenguajeconsultaorm;
}




public void setLenguajeconsultaorm(String lenguajeconsultaorm) {
	this.lenguajeconsultaorm = lenguajeconsultaorm;
}



//Metodo implementeado de la interface


@Override
public String DevolverCapacidadRespuesta(String Sistema_operativo, int Cantidad_De_Peticiones, String Procesador) {
	if(Sistema_operativo == "linux" && Cantidad_De_Peticiones <= 1000 && Procesador == "amd") {	
		return  "Optimo";
	}

	if(Sistema_operativo == "linux" && 1000<= Cantidad_De_Peticiones && Procesador == "amd" ){
	return "Optimo";	


	}

	if (Sistema_operativo == "Windows" && Cantidad_De_Peticiones <= 1000 && Procesador == "intel") {
		return "Optimo";
		
	}
	if (Sistema_operativo == "Windows" && 1000 <= Cantidad_De_Peticiones && Procesador == "intel") {
		return "Pesimo";
	}
	return Procesador;
	
}





}
