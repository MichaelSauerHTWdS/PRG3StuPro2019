/**
*@author Zoubair Khoulaidi
*@Date 03.06.2019
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
		
		return true;
	}
	public boolean update_Ware(Ware ware) {
		
		return true;
	}
	public boolean Delete_Ware(Ware ware) {
		
		return true;
	}
	
	public void search_Ware(Ware ware) {
		
	}
	public String toString() {
		return "Lager";
	}
	
}
