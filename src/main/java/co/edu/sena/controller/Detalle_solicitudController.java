package co.edu.sena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.service.Detalle_solicitudService;

@RestController
@RequestMapping("/api/detalle_solicitudes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class Detalle_solicitudController {

	@Autowired
	Detalle_solicitudService detalle_solicitudService;
}
