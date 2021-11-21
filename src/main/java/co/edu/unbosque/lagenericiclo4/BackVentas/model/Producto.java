package co.edu.unbosque.lagenericiclo4.BackVentas.model;

public class Producto {
	
	private String codigoProducto;
	private String nombreProducto;
	private Double cantidad;
	private Double valorTotal;
	
	public Producto() {
	}
		
	public Producto(String codigoProducto, String nombreProducto, Double cantidad, Double valorTotal) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.valorTotal = valorTotal;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", cantidad="
				+ cantidad + ", valorTotal=" + valorTotal + "]";
	}
}
