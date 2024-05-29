package co.edu.sena.models.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import co.edu.sena.models.entity.Solicitud;

public interface SolicitudService {

	public Solicitud crearSolicitud(Solicitud solicitud);
	public ResponseEntity<Solicitud> editarSolicitud(Solicitud solicitud, Integer idSolicitud);
	public void eliminarSolicitud(Integer idSolicitud);
	public List<Solicitud> listadoSolicitudes();
}
