package com.demo.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dto.State;
import com.demo.repo.StateRepo;

@Service
@Transactional
public class StateServiceImpl implements StateService{
	
	@Autowired
	public StateRepo stateRepo;
	

	@Override
	public State getByCountryname(String countryname) {
		return stateRepo.findByCountryname(countryname);
	}


	@Override
	public State addState(State state) {
		stateRepo.save(state);
		return state;
	}


	@Override
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		return stateRepo.findAll();
	}


	
	
//	private Map <Integer, State> states = new HashMap<Integer, State>(); 

	
	
//	public StateServiceImpl() {
//		states.put(1, new State("Afghanistan", "Kabul", "Kandahar", "Kapisa", "Ghaznī", "Balkh","Zaranj", "Baghlān"));
//		states.put(1,new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.put(1,new State("Andorra", "Sant Julia de Loria", "La Massana", "Encamp", "Canillo", "Andorra la Vella ","Escaldes-Engordany", "Ordino"));
//		states.put(1,new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.put(1,new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.put(1,new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		
//	}
//	
//	List<State> states = new ArrayList<State>();
//	
//	@Autowired
//	public StateServiceImpl() {
//		states.add(new State("Afghanistan", "Kabul", "Kandahar", "Kapisa", "Ghaznī", "Balkh","Zaranj", "Baghlān"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Andorra", "Sant Julia de Loria", "La Massana", "Encamp", "Canillo", "Andorra la Vella ","Escaldes-Engordany", "Ordino"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//	}
//	
	
	
//	private List<State> getAllStates(){
//		List<State> states = new ArrayList<State>();
//		states.add(new State("Afghanistan", "Kabul", "Kandahar", "Kapisa", "Ghaznī", "Balkh","Zaranj", "Baghlān"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Andorra", "Sant Julia de Loria", "La Massana", "Encamp", "Canillo", "Andorra la Vella ","Escaldes-Engordany", "Ordino"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		states.add(new State("Algeria", "Batna ", "Biskra ", "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"));
//		return states;
//		
//	}

}
