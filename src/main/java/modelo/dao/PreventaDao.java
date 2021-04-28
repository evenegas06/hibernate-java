package modelo.dao;

import java.util.List;
import modelo.dto.Preventa;

public class PreventaDao extends Dao {

	public void persist(Preventa entity) {
		getCurrentSession().save(entity);
	}

	public void update(Preventa entity) {
		getCurrentSession().update(entity);
	}

	public Preventa findById(int id) {
		Preventa preventa = (Preventa) getCurrentSession().get(Preventa.class, id);
		return preventa;
	}

	public void delete(Preventa entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Preventa> findAll() {
		List<Preventa> preventas = (List<Preventa>) getCurrentSession().createQuery("from Preventa").list();
		return preventas;
	}

}