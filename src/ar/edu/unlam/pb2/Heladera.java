package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private String descripcion;
	private Boolean isNotFrost;
	private Integer garantia;
	private String marca;
	private Double precio;
	
	public Heladera(Integer codigo, String desripcion, Boolean isNotFrost, Integer garantia, String marca, Double precio) {
		super(codigo);
		this.descripcion=desripcion;
		this.isNotFrost=true;
		this.garantia=garantia;
		this.marca=marca;
		this.precio=precio;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
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

	public Boolean isNoFrost() {
		return true;
	}

}
