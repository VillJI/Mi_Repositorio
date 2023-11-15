package parcialLaboratorioVillalbaJuan;

public class Auto extends Terrestre{
	private Motor miMotor;
	private Odometro miOdometro;
	private TanqueCombustible miTanque;
	
	public Auto(int capacidad, TanqueCombustible miTanque, Odometro miOdometro, Motor miMotor)
	{
		this.miMotor = miMotor;
		this.miOdometro = miOdometro;
		this.miTanque = miTanque;
	}

	public Motor getMiMotor() 
	{
		return miMotor;
	}

	public void setMiMotor(Motor miMotor) 
	{
		this.miMotor = miMotor;
	}

	public Odometro getMiOdometro() 
	{
		return miOdometro;
	}

	public void setMiOdometro(Odometro miOdometro) 
	{
		this.miOdometro = miOdometro;
	}

	public TanqueCombustible getMiTanque() 
	{
		return miTanque;
	}

	public void setMiTanque(TanqueCombustible miTanque) 
	{
		this.miTanque = miTanque;
	}
	
	public void arrancarAuto()
	{
		miMotor.encenderMotor();
	}
	
	public void apagarAuto()
	{
		miMotor.apagarMotor();
	}
	
	public void avanzarAuto()
	{
		
	}
	

}
