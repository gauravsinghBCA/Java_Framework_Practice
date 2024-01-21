package g.gaurav;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadData {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ajay");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Assist a = entitymanager.find(Assist.class,2);
		System.out.println(a);

	}

}
