package modelo.delegate;

import java.util.List;
import modelo.dao.PreventaDao;
import modelo.dto.Preventa;

public class PreventaDelegate {
	private PreventaDao dao;

	public PreventaDelegate() {
	dao = new PreventaDao();
	}

	public void persist(Preventa entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Preventa entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Preventa findById(int id) {
		dao.openCurrentSession();
		Preventa empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Preventa empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Preventa> findAll() {
		dao.openCurrentSession();
		List<Preventa> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

