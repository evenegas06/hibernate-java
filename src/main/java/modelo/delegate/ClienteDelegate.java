package modelo.delegate;


import java.util.List;
import modelo.dao.ClienteDao;
import modelo.dto.Cliente;

public class ClienteDelegate {
	private ClienteDao dao;

	public ClienteDelegate() {
	dao = new ClienteDao();
	}

	public void persist(Cliente entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Cliente entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Cliente findById(int id) {
		dao.openCurrentSession();
		Cliente empresa = dao.findById(id);
		dao.closeCurrentSession();
		return empresa;
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Cliente empresa = dao.findById(id);
		dao.delete(empresa);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Cliente> findAll() {
		dao.openCurrentSession();
		List<Cliente> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

