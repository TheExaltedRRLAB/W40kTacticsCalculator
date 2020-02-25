package models;

import java.util.LinkedList;
import java.util.ListIterator;

public class Unit {

	private String unit_name;
	private LinkedList<Model> unit_members;
	private ForceOrg force_org_slot;
	
	public Unit(String unit_name, LinkedList<Model> unit_members, ForceOrg force_org_slot){
		this.unit_name = unit_name;
		this.unit_members = unit_members;
		this.force_org_slot = force_org_slot;
	}
	
	public int GetUnitSize(){
		return unit_members.size();
	}
	
	public ForceOrg GetForceOrgSlot(){
		return force_org_slot;
	}
	
	public LinkedList<Model> GetUnitMembers(){
		return unit_members;
	}
	
	public String GetUnitName(){
		return unit_name;
	}
	
	public void AddModel(Model model){
		unit_members.add(model);
	}
	
	public void RemoveModel(int index){
		if(index >= 0 && index < GetUnitSize())
		unit_members.remove(index);
	}
	
	public void PrintUnitStats(){
		
		System.out.println("--- Unit: " + unit_name + " ---");
		System.out.println("Force Org: " + force_org_slot);
		System.out.println("Members:   " + GetUnitSize());
		ListIterator<Model> listIterator = unit_members.listIterator();
		int member_count = 0;
		
        while (listIterator.hasNext()) {
            member_count++;
        	System.out.println("\n> Member " + member_count);
            listIterator.next().PrintModelStats();
		}
        
		System.out.println("--------------------");

	}
}
