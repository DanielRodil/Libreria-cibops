package es.mde.cibops;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operacion {
	
	private String nombre;
	private String descripcion;
//	private Agente poc;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;
	private List<Evento> eventos = new ArrayList<>();

	public String getNombre() {
		return nombre.toUpperCase();
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

//	public Agente getPoc() {
//		return poc;
//	}
//
//	public void setPoc(Agente poc) {
//		this.poc = poc;
//	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public Operacion() {}

	public Operacion(String nombre, String descripcion, LocalDate fechaApertura, LocalDate fechaCierre,
			List<Evento> eventos) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;
		this.eventos = eventos;
	}
	
	

//	public List<String> getListadoEventosOperacion() {
//		List<String> eventos = new ArrayList<String>();
//		for (Evento evento : getEventos()) {
//			eventos.add(evento.getNombre());
//		}
//		return eventos;
//	}
//	
//	public List<Agente> getAgentesParticipantesOperacion() {
//		HashSet<Agente> agentes = new HashSet<Agente>();
//		agentes.add(getPoc());
//		for (Evento evento : getEventos()) {
//			agentes.addAll(evento.getAgentesParticipantes());
//		}
//		List<Agente> listaAgentes = new ArrayList<Agente>(agentes);
//		return listaAgentes;
//	}
	
}
