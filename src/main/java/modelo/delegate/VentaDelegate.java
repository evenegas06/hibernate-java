package modelo.delegate;


import java.util.List;
import modelo.dao.VentaDao;
import modelo.dto.Venta;

public class VentaDelegate {
	private VentaDao dao;

	public VentaDelegate() {
	dao = new VentaDao();
	}

	public void persist(Venta entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Venta entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Venta findById(int id) {
		dao.openCurrentSession();
		Venta empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Venta empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Venta> findAll() {
		dao.openCurrentSession();
		List<Venta> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

