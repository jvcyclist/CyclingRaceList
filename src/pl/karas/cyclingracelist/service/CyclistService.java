package pl.karas.cyclingracelist.service;

import java.util.List;

import pl.karas.cyclingracelist.entity.Cyclist;

public interface CyclistService {

	public List<Cyclist> getCyclists();
	
	public void saveCyclists(Cyclist theCyclist);

	public Cyclist getCyclist(int theId);
	
	
	
	
}
