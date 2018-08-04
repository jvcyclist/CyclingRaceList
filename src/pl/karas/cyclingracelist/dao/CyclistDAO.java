package pl.karas.cyclingracelist.dao;

import java.util.List;

import pl.karas.cyclingracelist.entity.Cyclist;

public interface CyclistDAO {

	public List<Cyclist> getCyclists();
	
	public void saveCyclist(Cyclist theCyclist);
	
}
