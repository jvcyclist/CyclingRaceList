package pl.karas.cyclingracelist.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.karas.cyclingracelist.dao.CyclistDAO;
import pl.karas.cyclingracelist.entity.Cyclist;

@Service
public class CyclistServiceImpl implements CyclistService {
	
	
	@Autowired
	private CyclistDAO cyclistDAO;
	
	@Override
	@Transactional
	public List<Cyclist> getCyclists() {
		return cyclistDAO.getCyclists();
		
	}

	@Override
	@Transactional
	public void saveCyclists(Cyclist theCyclist) {
		cyclistDAO.saveCyclist(theCyclist);

	}

	@Override
	public Cyclist getCyclist(int theId) {
		// TODO Auto-generated method stub
		
	}


}
