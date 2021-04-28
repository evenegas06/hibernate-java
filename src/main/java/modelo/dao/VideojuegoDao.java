package modelo.dao;


import java.util.List;
import modelo.dto.Videojuego;

public class VideojuegoDao extends Dao {

	public void persist(Videojuego entity) {
		getCurrentSession().save(entity);
	}

	public void update(Videojuego entity) {
		getCurrentSession().update(entity);
	}

	public Videojuego findById(int id) {
		Videojuego videojuego = (Videojuego) getCurrentSession().get(Videojuego.class, id);
		return videojuego;
	}

	public void delete(Videojuego entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Videojuego> findAll() {
		List<Videojuego> videojuegos = (List<Videojuego>) getCurrentSession().createQuery("from Videojuego").list();
		return videojuegos;
	}

}