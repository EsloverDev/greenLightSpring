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
import org.springframework.http.ResponseEntity;
import co.edu.sena.models.entity.Perfil;
import co.edu.sena.models.service.PerfilService;

@RestController
@RequestMapping("/api/perfiles")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class PerfilController {

	@Autowired
	PerfilService perfilService;
	
	/*@GetMapping("/{id}")
	public Optional<Perfil> buscarPorId(@PathVariable Integer id) {
		return perfilService.findById(id);
	}
	
	@GetMapping("/{email}")
	public Optional<Perfil> buscarPorEmail(@PathVariable String email) {
		return perfilService.findByEmail(email);
	}
	*/
	
	@GetMapping("/listar")
	public List<Perfil> listarTodos(){
		return perfilService.findAll();
	}
	
	@PostMapping
	public Perfil guardar(@RequestBody Perfil p) {
		return perfilService.save(p);
	}
	
	/*@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		perfilService.deleteById(id);
	}
	
	@DeleteMapping("/{email}")
	public void eliminarPorEmail(@PathVariable String email) {
	    Optional<Perfil> perfilOptional = perfilService.findByEmail(email);
	    if (perfilOptional.isPresent()) {
	        Perfil perfil = perfilOptional.get();
	        perfilService.deleteById(perfil.getId());
	    }
	}

	
	@PutMapping("/actualizar/{email}")
	public Perfil actualizar(@RequestBody Perfil p, @PathVariable String email) {
		Optional<Perfil> perfilOptional = perfilService.findByEmail(email);
		if (perfilOptional.isPresent()) {
			Perfil pEnBD = perfilOptional.get();
			pEnBD.setNombre(p.getNombre());
			pEnBD.setPassword(p.getPassword());
			pEnBD.setEmail(p.getEmail());
			pEnBD.setTelefono(p.getTelefono());
			pEnBD.setPais(p.getPais());
			pEnBD.setCiudad(p.getCiudad());
			pEnBD.setLocalidad(p.getLocalidad());
			pEnBD.setDocumento(p.getDocumento());
			return perfilService.update(pEnBD);
		}
		return null;
	}
	*/
	
	@PostMapping("/login")
	public ResponseEntity<String> iniciarSesion(@RequestBody Perfil perfil) {
		String mensaje = perfilService.login(perfil.getEmail(), perfil.getPassword());
		return ResponseEntity.ok(mensaje);
	}

}
