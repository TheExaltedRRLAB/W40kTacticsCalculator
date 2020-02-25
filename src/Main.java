import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
	
		
		// test
		LinkedList<models.Wargear> wargear = new LinkedList<models.Wargear>();
		LinkedList<models.Weapon> weapons = new LinkedList<models.Weapon>();
		weapons.add(new models.Weapon("Bolter", 24, 4, 5, models.WeaponClass.RapidFire, 1, new LinkedList<String>()));
		LinkedList<String> special_rules = new LinkedList<String>();
		special_rules.add("test");
		
		models.Model model = new models.Model("Space Marine", models.ModelType.SuperHeavy, 
				//WS  BS  S   T   W   I   A   MW  AS  IS  
				   4, 4, 4, 4, 4, 4, 1, 10, 3, 0,
				weapons, wargear, special_rules);
		LinkedList<models.Model> modelle = new LinkedList<models.Model>();
		modelle.add(model);
		
		models.Unit unit = new models.Unit("Trupp 1", modelle, models.ForceOrg.Standard);
				
		//model.PrintModelStats();
		unit.PrintUnitStats();
	}

}
