package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Recolector;
import co.edu.sena.repository.RecolectorRepository;

@Service
public class RecolectorServiceImpl implements RecolectorService {

	@Autowired
	RecolectorRepository recolectorRepository;
	
	@Override
	public Optional<Recolector> findById(Integer id) {
		return recolectorRepository.findById(id);
	}

	@Override
	public List<Recolector> findAll() {
		return recolectorRepository.findAll();
	}

	@Override
	public Recolector save(Recolector r) {
		return recolectorRepository.save(r);
	}

	@Override
	public void deleteById(Integer id) {
		recolectorRepository.deleteById(id);
	}

	@Override
	public String login(String email, String pass) {
		
		Recolector rec = recolectorRepository.findByPerfilEmail(email);
		if (rec == null) {
			return "Recolector aún no estás registrado";
		}
		String passwordRecolector = rec.getPer().getPassword();
		if (!passwordRecolector.equals(pass)) {
			return "contraseña incorrecta";
		}
		return "Bienvenido";
	}

}
