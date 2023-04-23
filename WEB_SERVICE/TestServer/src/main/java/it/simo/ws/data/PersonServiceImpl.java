package it.simo.ws.data;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName="manager")
public class PersonServiceImpl implements PersonService {

private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@Override
	@WebMethod(operationName="add")
	public boolean addPerson(Person p) {
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
	}

	@Override
	@WebMethod(operationName="delete")
	public boolean deletePerson(int id) {
		if(persons.get(id) == null) return false;
		persons.remove(id);
		return true;
	}

	@Override
	@WebMethod(operationName="getPerson")
	public Person getPerson(int id) {
		return persons.get(id);
	}

	@Override
	@WebMethod(operationName="getAll")
	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

}
