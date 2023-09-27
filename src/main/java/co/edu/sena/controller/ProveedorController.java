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
import co.edu.sena.models.entity.Proveedor;
import co.edu.sena.models.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ProveedorController {

	@Autowired
	ProveedorService proveedorService;
	
	@GetMapping("/{id}")
	public Optional<Proveedor> buscarPorId(@PathVariable Integer id) {
		return proveedorService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Proveedor> listarTodos(){
		return proveedorService.findAll();
	}
	
	@PostMapping
	public Proveedor guardar(@RequestBody Proveedor p) {
		return proveedorService.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		proveedorService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Proveedor actualizar(@RequestBody Proveedor p, @PathVariable Integer id) {
		Proveedor pEnBD = proveedorService.findById(id).get();
		pEnBD.setDireccion(p.getDireccion());
		return proveedorService.save(pEnBD);
	}
}
