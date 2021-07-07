package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan 1 producto
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado (stock) 3 productos
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	private Integer stockRemera;
	private Integer stockGalletita;
	private Integer stockCarne;
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre=nombre;
		this.productosExistentes= new HashSet<Producto>();
		this.productosDisponibles= new ArrayList<Producto>();
		this.ventasRealizadas= new HashMap<Integer, Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto (intesar al set y al list)	
		productosExistentes.add(nuevo);
		productosDisponibles.add(nuevo);
		if (nuevo instanceof Remera)
			stockRemera++;
		if (nuevo instanceof Carne)
			stockCarne++;
		if (nuevo instanceof Galletitas)
			stockGalletita++;
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer stock = null;
		if (getProductoPorCodigo(codigo) instanceof Remera)
			stock = stockRemera;
		if (getProductoPorCodigo(codigo) instanceof Galletitas)
			stock = stockGalletita;
		if (getProductoPorCodigo(codigo) instanceof Carne)
			stock = stockCarne;
		return stock;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		if(getProductoPorCodigo(codigoDeProducto)==null){
			throw new ProductoInexistente();
		}
		return true;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) /*throws ProductoSinStock*/ {
		// Busca la disponibilidad de un producto
		for (Producto productoBuscado : productosDisponibles) {
			if(productoBuscado.getCodigoDeProducto().equals(codigoDeProducto)) {
				return productoBuscado;
			}
		}
		return null;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
		return ventasRealizadas.get(numeroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
