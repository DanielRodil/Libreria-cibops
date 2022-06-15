package es.mde.cibops;

import java.util.List;

public abstract class Evento {

	private String nombre;
	private String descripcion;
	private List<Agente> agentesParticipantes;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Agente> getAgentesParticipantes() {
		return agentesParticipantes;
	}

	public void setAgentesParticipantes(List<Agente> agentesParticipantes) {
		this.agentesParticipantes = agentesParticipantes;
	}
	
	public Evento() {}
	
	public Evento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
		
}
