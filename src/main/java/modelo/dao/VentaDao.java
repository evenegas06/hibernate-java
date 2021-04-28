package modelo.dao;

import java.util.List;
import modelo.dto.Venta;

public class VentaDao extends Dao {

	public void persist(Venta entity) {
		getCurrentSession().save(entity);
	}

	public void update(Venta entity) {
		getCurrentSession().update(entity);
	}

	public Venta findById(int id) {
		Venta venta = (Venta) getCurrentSession().get(Venta.class, id);
		return venta;
	}

	public void delete(Venta entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Venta> findAll() {
		List<Venta> ventas = (List<Venta>) getCurrentSession().createQuery("from Venta").list();
		return ventas;
	}

}