package modelo.dao;

import java.util.List;
import modelo.dto.VideojuegoVenta;

public class VideojuegoVentaDao extends Dao {

	public void persist(VideojuegoVenta entity) {
		getCurrentSession().save(entity);
	}

	public void update(VideojuegoVenta entity) {
		getCurrentSession().update(entity);
	}

	public VideojuegoVenta findById(int id) {
		VideojuegoVenta cliente = (VideojuegoVenta) getCurrentSession().get(VideojuegoVenta.class, id);
		return cliente;
	}

	public void delete(VideojuegoVenta entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<VideojuegoVenta> findAll() {
		List<VideojuegoVenta> clientes = (List<VideojuegoVenta>) getCurrentSession().createQuery("from VideojuegoVenta").list();
		return clientes;
	}

}