package parcial3;
//aqui hago uso de la herencia y del polimorfismo con la palabra implements//

public class Oracle extends Conexion implements OperacionesConexion {
	
//Atributos privados//
	
private boolean psql;
private int cantidaddeusuariospermitidos;


//Constante 

private static final int PETICIONES_CONCURRENTES = 1000;

//Constructor con 2 elementos

public Oracle(boolean psql, int cantidaddeusuariospermitidos) {
	super();
	this.psql = psql;
	this.cantidaddeusuariospermitidos = cantidaddeusuariospermitidos;
}


//Constructor vacio

public Oracle() {
	super();
}




//Getter y setters//


public boolean isPsql() {
	return psql;
}


public void setPsql(boolean psql) {
	this.psql = psql;
}


public int getCantidaddeusuariospermitidos() {
	return cantidaddeusuariospermitidos;
}


public void setCantidaddeusuariospermitidos(int cantidaddeusuariospermitidos) {
	this.cantidaddeusuariospermitidos = cantidaddeusuariospermitidos;
}

//Metodo heredado//

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









