package modelo.dao;


import java.util.List;
import modelo.dto.Cliente;

public class ClienteDao extends Dao {

	public void persist(Cliente entity) {
		getCurrentSession().save(entity);
	}

	public void update(Cliente entity) {
		getCurrentSession().update(entity);
	}

	public Cliente findById(int id) {
		Cliente cliente = (Cliente) getCurrentSession().get(Cliente.class, id);
		return cliente;
	}

	public void delete(Cliente entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		List<Cliente> clientes = (List<Cliente>) getCurrentSession().createQuery("from Cliente").list();
		return clientes;
	}

}