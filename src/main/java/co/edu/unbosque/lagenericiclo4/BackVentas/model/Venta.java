package co.edu.unbosque.lagenericiclo4.BackVentas.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ventas")
public class Venta {
	
	@Id
	private String id;
	private String codigoVenta;
	private String cedulaCliente;
	private List<Producto> detalle;
	private Double valor;
	private Double iva;
	private Double totalVenta;
	
	public Venta() {
	}
	
	public Venta(String codigoVenta, String cedulaCliente,List<Producto> detalle, Double valor, Double iva,Double totalVenta) {
		this.codigoVenta = codigoVenta;
		this.cedulaCliente = cedulaCliente;
		this.detalle = detalle;
		this.valor = valor;
		this.iva = iva;
		this.totalVenta = totalVenta;
	}

	public String getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(String codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public List<Producto> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<Producto> detalle) {
		this.detalle = detalle;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(Double totalVenta) {
		this.totalVenta = totalVenta;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", codigoVenta=" + codigoVenta + ", cedulaCliente=" + cedulaCliente + ", valor="
				+ valor + ", iva=" + iva + ", totalVenta=" + totalVenta + "]";
	}	
}