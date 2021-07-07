package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	// 		Electrodomestico producto = new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0);
	
	private String descripcion;
	private Integer pulgadas;
	private Integer garantia;
	private String marca;
	private Double precio;
	
	public Televisor(Integer codigo, String desripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(codigo);
		this.descripcion=desripcion;
		this.pulgadas=pulgadas;
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

	public Integer getPulgadas() {
		return pulgadas;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPrecio() {
		return precio;
	}
	

}
