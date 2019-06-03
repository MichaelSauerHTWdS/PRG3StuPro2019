/**
 * @brief	Klasse Schiff der Anwendung
 * @author	jwenner
 */

public class Schiff
{
	private int zustand;				// Zustand des Schiffs 0 - 100
	private int max_kapazitaet;	// Maximale Kapazität des Schiffs, entschieden durch Typ
	private Typ schiffstyp;
	
	public static enum Typ
	{
		SCHNIGGE,
		KOGGE,
		HOLK,
		KRAWEEL,
		KARACKE,
		LINIENSCHIFF
	}
	
	public Schiff(Typ schiffstyp)
	{
		this.zustand = 100;
		this.schiffstyp = schiffstyp;
		this.max_kapazitaet = Schiff.getKapazitaet(schiffstyp);
	
	}
	
	private static int getKapazitaet(Typ schiffstyp)
	{
		int kapazitaet = -1;
		
		switch(schiffstyp)
		{
			case SCHNIGGE:		kapazitaet = 40;
								break;
			case KOGGE:			kapazitaet = 100;
								break;
			case HOLK:			kapazitaet = 150;
								break;
			case KRAWEEL:		kapazitaet = 400;
								break;
			case KARACKE:		kapazitaet = 600;
								break;
			case LINIENSCHIFF:	kapazitaet = 1000;
								break;
		}
		
		return kapazitaet;
	}
	
	public static String getTypString(Typ schiffstyp)
	{
		String s = "";
		
		switch(schiffstyp)
		{
			case SCHNIGGE:		s = "Schnigge";
								break;
			case KOGGE:			s = "Kogge";
								break;
			case HOLK:			s = "Holk";
								break;
			case KRAWEEL:		s = "Kraweel";
								break;
			case KARACKE:		s = "Karacke";
								break;
			case LINIENSCHIFF:	s = "Linienschiff";
								break;
		}
		
		return s;
	}
	
	public void verschleiss(int prozent)
	{
		this.zustand -= prozent;
		if(this.zustand < 0)
			zustand = 0;
	}
	
	public String toString()
	{
		
		String s = "Schiffstyp: " + getTypString(this.schiffstyp) + "\n"
					+ "Zustand: " + this.zustand + "\n"
					+ "Kapazität: " + this.max_kapazitaet + "\n";
		
		return s;
	}
}
