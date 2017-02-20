package str;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
		Vendor v =new Vendor();
		            
		            v.setVendorId(100);
		            v.setVendorName("raj");
		            
		            
		 Customer c1=new Customer();
		             
		             c1.setCustomerId(503);
		             c1.setCustomerName("customer4");
		             
		 Customer c2=new Customer();
		             
		             c2.setCustomerId(504);
		             c2.setCustomerName("customer5");           
		             
         Customer c3=new Customer();
		             
		             c3.setCustomerId(505);
		             c3.setCustomerName("customer6");
		             
		             
		             
		   Set s=new HashSet();
		  
				        s.add(c1);
				        s.add(c2);
				        s.add(c3);
		        
		        
		              v.setChildren(s);
		              
		    Transaction tx = session.beginTransaction();
		                
		     session.save(v);
		     session.save(c1);
		     session.save(c2);
		     session.save(c3);    
		     
		    tx.commit();
		    session.close();
		    System.out.println("One To Many is Done..!!");
		    factory.close();
		             
		             
		System.out.println("kykjyukiu");
	}
}
