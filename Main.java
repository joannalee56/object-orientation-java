public class Main {

	public static void getSellabilityReport(Melon[] melons){
		for (Melon melon : melons){
			String sellability;
			if (melon.isSellable() == true){
				sellability = "CAN BE SOLD";
			} else {
				sellability = "NOT SELLABLE";
			}
			String report = String.format("Harvested by %s from Field %d (%s)", melon.harvester, melon.field, sellability);
			System.out.println(report);
		}
	}

	public static void main(String[] args) {
		MelonType musk = new MelonType("musk", "Muskmelon", 1998, "green", true, true);

		MelonType cas= new MelonType("cas", "Casaba", 2003, "orange", true, false);

		MelonType cren = new MelonType("cren", "Crenshaw", 2003, "orange", true, false);

		MelonType yw= new MelonType("yw", "Yellow Watermelon", 2013, "yellow", true, true);

		MelonType[] melonTypes = {musk, cas, cren, yw};

		Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, "Michael");
		Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, "Michael");
		Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, "Michael");
		Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, "Sheila");

		Melon[] melons = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		System.out.println("Instantiate objects here!");


		getSellabilityReport(melons);
	}

}
