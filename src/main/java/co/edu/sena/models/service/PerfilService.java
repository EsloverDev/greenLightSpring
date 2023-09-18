package co.edu.sena.models.service;

import co.edu.sena.models.entity.Perfil;

public interface PerfilService {

	public Perfil save(Perfil p);
	public String login(String perfil, String ctr);
}