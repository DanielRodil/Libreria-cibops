package es.mde.cibops;

public class GestionJudicialImpl extends Evento implements GestionJudicial {

	private String organoJudicial;
	
	@Override
	public String getOrganoJudicial() {
		return organoJudicial;
	}

	@Override
	public void setOrganoJudicial(String organoJudicial) {
		this.organoJudicial = organoJudicial;
	}

	public GestionJudicialImpl() {}

	public GestionJudicialImpl(String organoJudicial) {
		super();
		this.organoJudicial = organoJudicial;
	}	
	
}
