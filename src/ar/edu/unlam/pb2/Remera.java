package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {

	private String descripcion;
	private String talle;
	private String marca;
	private String color;
	private Double precio;
	
	public Remera(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo);
		this.descripcion=descripcion;
		this.talle=talle;
		this.marca=marca;
		this.color=color;
		this.precio=precio;
	}	
	
	@Override
	public String getTalle() {
		return talle;
	}

	@Override
	public String getColor() {
		return color;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPrecio() {
		return precio;
	}

}
