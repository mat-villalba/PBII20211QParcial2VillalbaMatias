package ar.edu.unlam.pb2;

public class Producto {

	private Integer codigoDeProducto;

	public Producto(Integer codigoDeProducto) {
		this.setCodigoDeProducto(codigoDeProducto);
	}

	public Integer getCodigoDeProducto() {
		return codigoDeProducto;
	}

	public void setCodigoDeProducto(Integer codigoDeProducto) {
		this.codigoDeProducto = codigoDeProducto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoDeProducto == null) ? 0 : codigoDeProducto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigoDeProducto == null) {
			if (other.codigoDeProducto != null)
				return false;
		} else if (!codigoDeProducto.equals(other.codigoDeProducto))
			return false;
		return true;
	}	
	
	
	
}
