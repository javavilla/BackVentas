package co.edu.unbosque.lagenericiclo4.BackVentas.repository;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.BackVentas.model.*;

public interface VentaRepository extends MongoRepository<Venta, String>{
	//List<Venta> findByUsuarioContaining(String usuario);
	//Optional<Venta> findByUsuario(String usuario);
	//void deleteByUsuario(String usuario);
}
