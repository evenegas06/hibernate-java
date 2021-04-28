package modelo.dao;

import java.util.List;
import modelo.dto.Consola;

public class ConsolaDao extends Dao {

	public void persist(Consola entity) {
		getCurrentSession().save(entity);
	}

	public void update(Consola entity) {
		getCurrentSession().update(entity);
	}

	public Consola findById(int id) {
		Consola consola = (Consola) getCurrentSession().get(Consola.class, id);
		return consola;
	}

	public void delete(Consola entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Consola> findAll() {
		List<Consola> consolas = (List<Consola>) getCurrentSession().createQuery("from Consola").list();
		return consolas;
	}

}