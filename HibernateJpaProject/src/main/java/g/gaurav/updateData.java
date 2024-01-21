package g.gaurav;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateData {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ajay");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		Assist a = entitymanager.find(Assist.class,2);
		if(a!=null) {
			a.setName("jishu");
			entitytransaction.begin();
			entitymanager.persist(a);
			entitytransaction.commit();
			}
		else {
			System.out.println("galat data");
		}

	}

}
