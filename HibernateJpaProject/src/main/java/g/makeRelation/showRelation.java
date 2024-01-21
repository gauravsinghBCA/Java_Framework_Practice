package g.makeRelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class showRelation {

	public static void main(String[] args) {
	
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ajay1");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		stuInfo s = entitymanager.find(stuInfo.class, 1);
		System.out.println(s.getName());
		for(course c : s.getCourseList()) {
			System.out.println(c.getCoursename());
		}
//		stuIdCard c = entitymanager.find(stuIdCard.class, 3);
//		
//		System.out.println(c.getStudent().getRoll()+" "+c.getStudent().getName()+" "+c.getCardno()+" "+c.getSoftwarevirsion());
//		course cs = entitymanager.find(course.class, 6);
//		System.out.println(cs.getStudent().getRoll()+" "+cs.getStudent().getName()+" "+cs.getCourseid()+" "+cs.getCoursename());
	}

}
