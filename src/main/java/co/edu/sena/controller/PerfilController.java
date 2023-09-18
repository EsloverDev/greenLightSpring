package co.edu.sena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Perfil;
import co.edu.sena.models.service.PerfilService;

@RestController
@RequestMapping("/api/perfiles")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class PerfilController {

	@Autowired
	PerfilService perfilService;
	
	@PostMapping
	public Perfil guardar(@RequestBody Perfil p) {
		return perfilService.save(p);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loguin(@RequestBody Perfil perfil) {
		String mensaje = perfilService.login(perfil.getUsername(), perfil.getPassword());
		return ResponseEntity.ok(mensaje);
	}
}
