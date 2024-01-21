package g.gaurav;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Intiator {

	public static void main(String[] args) {
		
		Assist a = new Assist();
		a.setRoll(1);
		a.setName("gaurav");
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ajay");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		entitymanager.persist(a);
		entitytransaction.commit();

	}

}
