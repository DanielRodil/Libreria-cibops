package es.mde.cibops;

public class ActividadOperativaImpl extends Evento implements ActividadOperativa {
	
	private float gastos;

	@Override
	public float getGastos() {
		return gastos;
	}

	@Override
	public void setGastos(float gastos) {
		this.gastos = gastos;
	}

	public ActividadOperativaImpl() {}

	public ActividadOperativaImpl(float gastos) {
		super();
		this.gastos = gastos;
	}

}
