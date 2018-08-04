package pl.karas.cyclingracelist.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.karas.cyclingracelist.entity.Cyclist;

@Repository
public class CyclistDAOImpl implements CyclistDAO {

	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Cyclist> getCyclists() {
		
		//get current session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//query
		
		Query<Cyclist> theQuery = currentSession.createQuery("from Cyclist order by bthyear",Cyclist.class);
		
		//execute query and get result list
		
		List<Cyclist> cyclists = theQuery.getResultList();
		
		return cyclists;
	}

	@Override
	public void saveCyclist(Cyclist theCyclist) {
		//get current session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save
		
		currentSession.save(theCyclist);

	}

}
