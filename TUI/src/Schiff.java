/**
 * @brief	Klasse Schiff der Anwendung
 * @author	jwenner
 */

public class Schiff
{
	private int zustand;				// Zustand des Schiffs 0 - 100
	private final int max_kapazitaet;	// Maximale Kapazität des Schiffs, entschieden durch Typ
	private final Typ schiffstyp;
	
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
	
	private static int getKapazitaet(Typ Schiffstyp)
	{
		int kapazitaet = -1;
		
		switch(Schiffstyp)
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
}
