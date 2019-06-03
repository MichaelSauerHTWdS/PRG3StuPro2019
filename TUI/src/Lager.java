package lager;

import java.util.ArrayList;
import java.util.List;

import ware.Ware;

public class Lager {

	private int id;
	private List<Ware> waren;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "";
	}
	
}

