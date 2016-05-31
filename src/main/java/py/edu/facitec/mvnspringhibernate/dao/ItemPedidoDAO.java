package py.edu.facitec.mvnspringhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.mvnspringhibernate.model.Cliente;
import py.edu.facitec.mvnspringhibernate.model.ItemPedido;
import py.edu.facitec.mvnspringhibernate.model.Producto;

@Repository
public class ItemPedidoDAO extends DaoGenerico<ItemPedido> {
	
	public ItemPedidoDAO() {
		super(ItemPedido.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext
	private EntityManager manager;
	
	

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return manager;
	}
}
