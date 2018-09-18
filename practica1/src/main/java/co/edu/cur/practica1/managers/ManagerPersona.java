package co.edu.cur.practica1.managers;

import co.edu.cur.daos.IPersonaDao;


public int guardar(Persona pPersona) throws Exception {
	
	if(pPersona !=null && pPersona.getEdad()>18) {
		
	  IPersonaDao daoPersona = new PersonaDao();
	  return daoPersona.grabar(pPersona);
	  
	}else { 
		throw new Exception("Persona Null o su edad no cumple con los requisitos");
	}
}

public int actualizar(Persona pPersona) throws Exception {
	
	if(pPersona !=null && pPersona.getDocumento()!=null) {
		
		  IPersonaDao daoPersona = new PersonaDao();
		  return daoPersona.actualizar(pPersona);
		  
	}else { 
		throw new Exception("Persona Null o su documento null");
	}
	}
}