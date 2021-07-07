package ar.edu.unlam.pb2;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Integer importe;
	
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.setDniDelComprador(dniDelComprador);
		this.setNombreDelComprador(nombreDelComprador);
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public Integer getImporte() {
		return importe;
	}

}
