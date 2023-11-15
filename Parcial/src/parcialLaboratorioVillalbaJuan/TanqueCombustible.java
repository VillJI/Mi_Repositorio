package parcialLaboratorioVillalbaJuan;

public class TanqueCombustible {
	private int capacidadTanque;
	private double cantidadCombustibleTanque;
	
	public TanqueCombustible(int capacidadTanque)
	{
		this.capacidadTanque = capacidadTanque;
		this.cantidadCombustibleTanque = 0;
	}

	public int getCapacidadTanque() 
	{
		return capacidadTanque;
	}

	public void setCantidadTanque(int capacidadTanque) 
	{
		this.capacidadTanque = capacidadTanque;
	}

	public double getCantidadCombustibleTanque() 
	{
		return cantidadCombustibleTanque;
	}

	public void setCantidadCombustibleTanque(double cantidadCombustibleTanque) 
	{
		this.cantidadCombustibleTanque = cantidadCombustibleTanque;
	}

	public void agregarCombustible(double cantidadCombustibleTanque, double cantidadCarga)
	{
		if ((cantidadCarga + cantidadCombustibleTanque) <= capacidadTanque)
		{
			cantidadCombustibleTanque = cantidadCombustibleTanque + cantidadCarga;
			System.out.println("Tanque Cargado");
		}
		else
		{
			System.out.println("Capacidad Superada");
		}	
	}
}
