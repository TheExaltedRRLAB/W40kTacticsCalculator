package models;

import java.util.LinkedList;

public class Model {

	private String model_name;
	private ModelType model_type;
	
	private int ballistic_skill;
	private int weapon_skill;
	private int strength;
	private int initiative;
	private int wounds;
	private int moral;
	private int toughness;
	private int attacks;
	private int save_armour;
	private int save_invulnerable;
	
	private int armour_front;
	private int armour_side;
	private int armour_rear;
	private int hull_points;
	
	private LinkedList<Weapon> weapons;
	private LinkedList<Wargear> wargear;
	private LinkedList<String> special_rules;
	
	/**
	 * Infantry-stat constructor
	 * @param model_name
	 * @param model_type
	 * @param weapon_skill
	 * @param ballistic_skill
	 * @param strength
	 * @param initiative
	 * @param wounds
	 * @param moral
	 * @param save_armour
	 * @param save_invulnerable
	 * @param weapons
	 * @param wargear
	 * @param special_rules
	 */
	public Model(String model_name, ModelType model_type, 
			int weapon_skill,
			int ballistic_skill,
			int strength,
			int toughness,
			int wounds,
			int initiative,
			int attacks,
			int moral_value,
			int save_armour,
			int save_invulnerable,
			LinkedList<Weapon> weapons,
			LinkedList<Wargear> wargear,
			LinkedList<String> special_rules){
		this.model_name = model_name;
		if(model_type == ModelType.Infantry ||
				model_type == ModelType.JumpTroop ||
				model_type == ModelType.MonstrousCreature ||
				model_type == ModelType.FlyingMonstrousCreature){
			this.model_type = model_type;
		} else {
			System.out.println("Warning: Wrong model type was chosen, setting to 'Infantry'");
			this.model_type = ModelType.Infantry;
		}
		
		// Handling of stats
		if(weapon_skill >= 0 && weapon_skill <= 10){
			this.weapon_skill = weapon_skill;
		} else {
			this.weapon_skill = 0;
		}
		if(weapon_skill >= 0 && weapon_skill <= 10){
			this.ballistic_skill = ballistic_skill;
		} else {
			this.ballistic_skill = 0;
		}
		if(strength >= 0 && strength <= 10){
			this.strength = strength;
		} else {
			this.strength = 0;
		}
		if(initiative >= 0 && initiative <= 10){
		this.initiative = initiative;
		} else {
			this.initiative = 0;
		}
		if(wounds > 0 && wounds <= 10){
			this.wounds = wounds;
		} else {
			this.wounds = 1;
		}
		if(attacks > 0){
			this.attacks = attacks;
		} else {
			this.attacks = 0;
		}
		if(toughness > 0 && toughness <= 10){
			this.toughness = toughness;
		} else {
			this.toughness = 0;
		}
		if(moral_value >= 2 && moral_value <= 10){
		this.moral = moral_value;
		} else {
			this.moral = 2;
		}
		if(save_armour >= 0 && save_armour <= 6){
		this.save_armour = save_armour;
		} else {
			this.save_armour = 0;
		}
		if(save_invulnerable >= 0 && save_invulnerable <= 6){
		this.save_invulnerable = save_invulnerable;
		} else {
			this.save_invulnerable = 0;
		}

		//Handling of equipment
		this.weapons = weapons;
		this.wargear = wargear;
		this.special_rules = special_rules;
	}
	
	/**
	 * walker constructor
	 * @param model_name
	 * @param model_type
	 * @param weapon_skill
	 * @param ballistic_skill
	 * @param strength
	 * @param initiative
	 * @param attacks
	 * @param armour_front
	 * @param armour_side
	 * @param armour_rear
	 * @param hull_points
	 * @param weapons
	 * @param wargear
	 * @param special_rules
	 */
	public Model(String model_name, ModelType model_type, 
			int weapon_skill,
			int ballistic_skill,
			int strength,
			int initiative,
			int attacks,
			int armour_front,
			int armour_side,
			int armour_rear,
			int hull_points,
			LinkedList<Weapon> weapons,
			LinkedList<Wargear> wargear,
			LinkedList<String> special_rules){
		
		//Handling of equipment
		this.weapons = weapons;
		this.wargear = wargear;
		this.special_rules = special_rules;
	}
	
	/**
	 * vehicle constructor
	 * @param model_name
	 * @param model_type
	 * @param ballistic_skill
	 * @param armour_front
	 * @param armour_side
	 * @param armour_rear
	 * @param hull_points
	 * @param weapons
	 * @param wargear
	 * @param special_rules
	 */
	public Model(String model_name, ModelType model_type, 
			int ballistic_skill,
			int armour_front,
			int armour_side,
			int armour_rear,
			int hull_points,
			LinkedList<Weapon> weapons,
			LinkedList<Wargear> wargear,
			LinkedList<String> special_rules){
		
		//Handling of equipment
		this.weapons = weapons;
		this.wargear = wargear;
		this.special_rules = special_rules;
	}
	
	public String GetModelName(){
		return model_name;
	}
	
	public ModelType GetModelType(){
		return model_type;
	}
	
	public int GetBallisticSkill(){
		return ballistic_skill;
	}
	
	public void SetBallisticSkill(int ballistic_skill){
		this.ballistic_skill = ballistic_skill;
	}
	
	public int GetWeaponSkill(){
		return weapon_skill;
	}
	
	public void SetWeaponSkill(int weapon_skill){
		this.weapon_skill = weapon_skill;
	}
	
	public int GetStrength(){
		return strength;
	}
	
	public void SetStrength(int strength){
		this.strength = strength;
	}
	
	public int GetInitiative(){
		return initiative;
	}
	
	public void SetInitiative(int initiative){
		this.initiative = initiative;
	}
	
	public int GetNumberOfWounds(){
		return wounds;
	}
	
	public void SetNumberOfWounds(int wounds){
		this.wounds = wounds;
	}
	
	public int GetMoralValue(){
		return moral;
	}
	
	public void SetMoralValue(int moral_value){
		this.moral = moral_value;
	}
	
	public int GetArmourSaveValue(){
		return save_armour;
	}
	
	public void SetArmourSaveValue(int armour_save){
		this.save_armour = armour_save;
	}
	
	public int GetInvulnerableSaveValue(){
		return save_invulnerable;
	}
	
	public void SetInvulnerableSaveValue(int invulnerable_save){
		this.save_invulnerable = invulnerable_save;
	}
	
	public int GetToughness(){
		return toughness;
	}
	
	public void SetToughness(int toughness){
		this.toughness = toughness;
	}
	
	public int GetNumberOfAttacks(){
		return attacks;
	}

	public void SetNumberOfAttacks(int attacks){
		this.attacks = attacks;
	}
	
	public LinkedList<Weapon> GetWeaponsList(){
		return weapons;
	}
	
	public LinkedList<Wargear> GetWargearList(){
		return wargear;
	}

	public LinkedList<String> GetSpecialRulesList(){
		return special_rules;
	}
	
	public void PrintModelStats(){
		if(model_type == ModelType.Infantry ||
				model_type == ModelType.JumpTroop ||
				model_type == ModelType.MonstrousCreature ||
				model_type == ModelType.FlyingMonstrousCreature){
			System.out.println("--- "+ model_name +" ---");
			System.out.println("Type: " + model_type);
			System.out.printf("%-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %n",
						      "WS", "BS", "S", "T", "W", "I", "A", "MW", "AS", "IS");
			System.out.printf("%-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %n",
							weapon_skill, ballistic_skill, strength, toughness, wounds, initiative,
							attacks, moral,
							(save_armour == 0) ? "--" : save_armour+"+",
							(save_invulnerable == 0) ? "--" : save_invulnerable+"+");

//		LinkedList<Weapon> weapons,
//		LinkedList<Wargear> wargear,
//		LinkedList<String> special_rules
		}
	}
	
}
