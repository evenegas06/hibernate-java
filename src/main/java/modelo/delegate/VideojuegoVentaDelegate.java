package modelo.delegate;


import java.util.List;
import modelo.dao.VideojuegoVentaDao;
import modelo.dto.VideojuegoVenta;

public class VideojuegoVentaDelegate {
	private VideojuegoVentaDao dao;

	public VideojuegoVentaDelegate() {
	dao = new VideojuegoVentaDao();
	}

	public void persist(VideojuegoVenta entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(VideojuegoVenta entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public VideojuegoVenta findById(int id) {
		dao.openCurrentSession();
		VideojuegoVenta empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		VideojuegoVenta empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<VideojuegoVenta> findAll() {
		dao.openCurrentSession();
		List<VideojuegoVenta> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

