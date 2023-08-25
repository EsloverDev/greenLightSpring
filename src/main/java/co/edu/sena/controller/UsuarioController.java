package co.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Usuario;
import co.edu.sena.models.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Integer id) {
	    return usuarioService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listarTodos(){
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario u) {
		return usuarioService.save(u);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario u, @PathVariable Integer id) {
		Usuario uEnBD = usuarioService.findById(id).get();
				uEnBD.setNombre(u.getNombre());
				uEnBD.setApellido(u.getApellido());
				uEnBD.setEdad(u.getEdad());
				uEnBD.setContrasena(u.getContrasena());
				
				return usuarioService.save(uEnBD);
	}
}
