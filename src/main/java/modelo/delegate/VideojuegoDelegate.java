package modelo.delegate;

import java.util.List;
import modelo.dao.VideojuegoDao;
import modelo.dto.Videojuego;

public class VideojuegoDelegate {
	private VideojuegoDao dao;

	public VideojuegoDelegate() {
	dao = new VideojuegoDao();
	}

	public void persist(Videojuego entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Videojuego entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Videojuego findById(int id) {
		dao.openCurrentSession();
		Videojuego empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Videojuego empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Videojuego> findAll() {
		dao.openCurrentSession();
		List<Videojuego> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}