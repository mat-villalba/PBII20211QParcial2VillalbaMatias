package ar.edu.unlam.pb2;

public class ProductoInexistente extends Exception {

	public ProductoInexistente() {
		super("El producto indicado no existe");
	}
	
}
