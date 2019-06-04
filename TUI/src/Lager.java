/**
 *@author Zoubair Khoulaidi
 *@date 03.06.2019
 *@name Lager Klasse
 */

package lager;

import java.util.ArrayList;
import java.util.List;

import ware.Ware;

public class Lager {

	private int id;
	private String name;
	private List<Ware> waren;
	
	Lager(){
		this.id = 0;
		this.name = "";
		waren = new ArrayList<Ware>();
		}
	
	Lager(int id, String name){
		this.id = id;
		this.name = name;
		waren = new ArrayList<Ware>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Ware> getWaren() {
		return waren;
	}
	public void setWaren(List<Ware> waren) {
		this.waren = waren;
	}
	
	public boolean add_Ware(Ware ware) {
        if(istVorhanden(ware))
        {
            System.out.println("ist schon Vorhanden"); // ich mache Exceptions später
            return false;
        }
        else
        {
            if(waren.add(ware))
                System.out.println("Ware added");
            else
                return false;
        }
        return true;
	}
	public boolean update_Ware(Ware ware, Ware ware_update) {
        for(Ware w : waren)
        {
            if(istVorhanden(ware)){
                ware.setName(ware_update.getName);  // muss wissen welche Attributen in WarenKlasse da sind...
            }
        }
		return true;
	}
	public boolean Delete_Ware(Ware ware) {
        if(!istVorhanden(ware)){
            System.out.println("Ware ist nicht Vorhanden"); // ich mache Exceptions später
            return false;
        }
        else{
            if(waren.remove(ware))
                System.out.println("Ware deleted");
            else
                return false;
        }
        return true;
	}
	
	public String search_Ware(Ware ware) {
		if(istVorhanden(ware))
        {
            System.out.println("Ware ist vorhanden");
            return ware.toString();
        }
        return "Ware ist icht Vorhanden";
	}
    
    public boolean istVorhanden(Ware ware){
        for(Ware w: waren)
        {
            if(w.getId == ware.getId)
                return true;
        }
        return false;
    }
	public String toString() {
		String s = "";
		
		s += "Lager ID: " + this.id + "\nName: " + this.name;
		for(Ware w : waren)
			s += "\n"+ w.toString();
		
		return s;
	}
	
}
