package co.edu.sena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Barrio;
import co.edu.sena.models.service.BarrioService;

@RestController
@RequestMapping("/api/barrios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class BarrioController {

	@Autowired
	BarrioService barrioService;
	
	@GetMapping("/barriosPorLocalidad/{localidad_id}")
	public List<Barrio> listadoBarriosPorLocalidad(@PathVariable int localidad_id){
		return barrioService.buscarBarrioPorLocalidad(localidad_id);
	}
}
