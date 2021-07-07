package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String descripcion;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private String marca;
	private Double precio;
	
	public Galletitas(Integer codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double precio) {
		super(codigo);
		this.descripcion=descripcion;
		this.fechaDeElaboracion=fechaDeElaboracion;
		this.fechaDeVencimiento=fechaDeVencimiento;
		this.marca=marca;
		this.precio=precio;
	}

	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPrecio() {
		return precio;
	}
	
	

}
