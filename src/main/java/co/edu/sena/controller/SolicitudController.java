package co.edu.sena.controller;

import java.util.List;

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

import co.edu.sena.models.entity.Solicitud;
import co.edu.sena.models.service.SolicitudService;

@RestController
@RequestMapping("/api/solicitudes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class SolicitudController {

	@Autowired
	SolicitudService solicitudService;
	
	@PostMapping("/crear")
	public Solicitud crearSolicitud(@RequestBody Solicitud solicitud) {
		return solicitudService.crearSolicitud(solicitud);
	}
	
	@PutMapping("/editar/{idSolicitud}")
	public ResponseEntity<Solicitud> editarSolicitud(@RequestBody Solicitud solicitud, @PathVariable Integer idSolicitud) {
		return solicitudService.editarSolicitud(solicitud, idSolicitud);
	}
	
	@DeleteMapping("/eliminar/{idSolicitud}")
	public void eliminarSolicitud(@PathVariable Integer idSolicitud) {
		solicitudService.eliminarSolicitud(idSolicitud);
	}
	
	@GetMapping("/listado")
	public List<Solicitud> listarSolicitudes(){
		return solicitudService.listadoSolicitudes();
	}
}
