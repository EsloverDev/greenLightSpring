package co.edu.sena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Rol;
import co.edu.sena.models.service.RolService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class RolController {

	@Autowired
	RolService rolService;
	
	@GetMapping("/listar")
	public List<Rol> listarRoles(){
		return rolService.listarRoles();
	}
}
