package co.edu.sena.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.edu.sena.models.entity.Recolector;
import co.edu.sena.models.service.RecolectorService;

@RestController
@RequestMapping("/api/recolector")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class RecolectorController {

	@Autowired
	RecolectorService recolectorService;
	
	@GetMapping("/{id}")
	public Optional<Recolector> buscarPorId(@PathVariable Integer id) {
		return recolectorService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Recolector> listarTodos(){
		return recolectorService.findAll();
	}
	
	@PostMapping
	public Recolector guardar(@RequestBody Recolector r) {
		return recolectorService.save(r);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		recolectorService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Recolector actualizar(@RequestBody Recolector r, @PathVariable Integer id) {
		Recolector rEnBD = recolectorService.findById(id).get();
		rEnBD.setUbicacionActual(r.getUbicacionActual());
		rEnBD.setEstado(r.getEstado());
		return recolectorService.save(rEnBD);
	}
}
