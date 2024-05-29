package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Solicitud;
import co.edu.sena.repository.SolicitudRepository;

@Service
public class SolicitudServiceImpl implements SolicitudService {

	@Autowired
	SolicitudRepository solicitudRepository;

	@Override
	public Solicitud crearSolicitud(Solicitud solicitud) {
		return solicitudRepository.save(solicitud);
	}

	@Override
	public ResponseEntity<Solicitud> editarSolicitud(Solicitud solicitud, Integer idSolicitud) {
		Optional<Solicitud> listaDeSolicitudes = solicitudRepository.findById(idSolicitud);
		try {
			if(listaDeSolicitudes.isPresent()) {
				listaDeSolicitudes.get().setDireccion(solicitud.getDireccion());
				listaDeSolicitudes.get().setTelefono(solicitud.getTelefono());
				listaDeSolicitudes.get().setBarrio(solicitud.getBarrio());
				
				Solicitud solicitudPorActualizar = solicitudRepository.save(listaDeSolicitudes.get());
				
			}
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
		return new ResponseEntity<Solicitud>(HttpStatus.OK);
	}

	@Override
	public void eliminarSolicitud(Integer idSolicitud) {
		try {
			solicitudRepository.deleteById(idSolicitud);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public List<Solicitud> listadoSolicitudes() {
			return solicitudRepository.findAll();
	}
}
