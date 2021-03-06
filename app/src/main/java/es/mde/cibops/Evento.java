package es.mde.cibops;

import java.util.List;

public abstract class Evento {

	private String nombre;
	private String descripcion;
	private List<Agente> agentes;

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
	
	public List<Agente> getAgentes() {
		return agentes;
	}

	public void setAgentes(List<Agente> agentes) {
		this.agentes = agentes;
	}

	public Evento() {}
	
	public Evento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
		
}
