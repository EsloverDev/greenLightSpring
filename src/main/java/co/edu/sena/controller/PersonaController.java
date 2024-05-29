package co.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import co.edu.sena.models.entity.Persona;
import co.edu.sena.models.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@GetMapping("/{id}")
	public Optional<Persona> buscarPorId(@PathVariable Integer id) {
		return personaService.findById(id);
	}
	
	@GetMapping("/email/{email}")
	public Optional<Persona> buscarPorEmail(@PathVariable String email) {
		return personaService.encontrarCorreo(email);
	}
	
	@GetMapping("/listar")
	public List<Persona> listarTodos(){
		return personaService.findAll();
	}
	
	@PostMapping
	public Persona guardar(@RequestBody Persona p) {
		return personaService.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		personaService.deleteById(id);
	}
	
	@DeleteMapping("/email/{email}")
	public void eliminarPorEmail(@PathVariable String email) {
		Optional<Persona> personaOptional = personaService.encontrarCorreo(email);
		if(personaOptional.isPresent()) {
			Persona persona = personaOptional.get();
			personaService.deleteById(persona.getId());
		}
	}
	
	@PutMapping("/actualizar/{email}")
	public Persona actualizar(@RequestBody Persona p, @PathVariable String email) {
		Optional<Persona> personaOptional = personaService.encontrarCorreo(email);
		if(personaOptional.isPresent()) {
			Persona pEnBD = personaOptional.get();
			pEnBD.setNombre(p.getNombre());
			pEnBD.setApellido(p.getApellido());
			pEnBD.setEmail(p.getEmail());
			pEnBD.setClave(p.getClave());
			pEnBD.setDocumento(p.getDocumento());
			pEnBD.setRol(p.getRol());
			pEnBD.setTipoDocumento(p.getTipoDocumento());
			return personaService.update(pEnBD);
		}
		return null;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> iniciarSesion(@RequestBody Persona persona) {
		String mensaje = personaService.login(persona.getEmail(), persona.getClave());
		return ResponseEntity.ok(mensaje);
	}
}
