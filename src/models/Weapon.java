package models;

import java.util.LinkedList;

public class Weapon {

	private String name;
	private int weapon_range;
	private int armour_penetration;
	private int range;
	private int number_of_shots;
	private int strength;
	private WeaponClass weapon_class;
	private LinkedList<String> special_rules;
	
	public Weapon(String name, 
			int weapon_range, int strength, int armour_penetration, 
			WeaponClass weapon_class, int number_of_shots, LinkedList<String> special_rules){
		this.name = name;
		this.weapon_class = weapon_class;
		this.weapon_range = weapon_range;
		this.strength = strength;
		this.armour_penetration = armour_penetration;
		this.number_of_shots = number_of_shots;
		this.special_rules = special_rules;
	}
	
	public Weapon(String name, 
			int strength,
			int armour_penetration,
			LinkedList<String> special_rules){
		this.name = name;
		this.armour_penetration = armour_penetration;
		this.special_rules = special_rules;
		
		// default values for close combat weapons
		this.weapon_range = 0;
		this.weapon_class = WeaponClass.Melee;
		this.number_of_shots = 0;
	}
	
	public String GetWeaponName(){
		return name;
	}
}
