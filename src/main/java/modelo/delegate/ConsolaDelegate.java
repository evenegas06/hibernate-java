package modelo.delegate;

import java.util.List;
import modelo.dao.ConsolaDao;
import modelo.dto.Consola;

public class ConsolaDelegate {
	private ConsolaDao dao;

	public ConsolaDelegate() {
	dao = new ConsolaDao();
	}

	public void persist(Consola entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Consola entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Consola findById(int id) {
		dao.openCurrentSession();
		Consola empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Consola empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Consola> findAll() {
		dao.openCurrentSession();
		List<Consola> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

