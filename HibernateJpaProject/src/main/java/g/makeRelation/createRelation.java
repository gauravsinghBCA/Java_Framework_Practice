package g.makeRelation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class createRelation {
	
	public static void main(String[] args) {
		
		stuInfo s1= new stuInfo();
		s1.setName("gaurav");
		
		stuInfo s2= new stuInfo();
		s2.setName("ritesh");
		
		stuIdCard sd = new stuIdCard();
		sd.setSoftwarevirsion("4.0.2");
		sd.setStudent(s1);
		
		stuIdCard sd1 = new stuIdCard();
		sd1.setSoftwarevirsion("5.0.2");
		sd1.setStudent(s2);
		s1.setCard(sd);
		s2.setCard(sd1);
		
		course cr = new course();
		cr.setCoursename("java");
		course crr = new course();
		crr.setCoursename("sql");
		
		cr.setStudent(s1);
		crr.setStudent(s1);
		List<course> l = new ArrayList<>();
		l.add(cr);
		l.add(crr);
		
		List<course> l1 = new ArrayList<>();
	    l1.add(crr);
	    s1.setCourseList(l);
		s2.setCourseList(l1);
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ajay1");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction =entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(s1);
		entitymanager.persist(s2);
		entitymanager.persist(sd);
		entitymanager.persist(sd1);
		entitymanager.persist(cr);
		entitymanager.persist(crr);
		entitytransaction.commit();
	}
	

}
