package ar.edu.unlam.pb2;

public class ProductoSinStock extends Exception {

	public ProductoSinStock() {
		super("El producto indicado no tiene stock");
	}
}
