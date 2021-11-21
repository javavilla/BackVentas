package co.edu.unbosque.lagenericiclo4.BackVentas.controller;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.lagenericiclo4.BackVentas.model.*;
import co.edu.unbosque.lagenericiclo4.BackVentas.repository.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	VentaRepository ventaRepository;
	
	@PostMapping("/ventas")
	public ResponseEntity<Venta> createUser(@RequestBody Venta venta) {
		try {
			Venta _venta = ventaRepository.save(new Venta(venta.getCodigoVenta(), venta.getCedulaCliente(),
					venta.getDetalle(), venta.getValor(), venta.getIva(), venta.getTotalVenta()));
			return new ResponseEntity<>(_venta, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
