package net.robertwmurphy.stfc;

public class RepLevels {
	
	private int id;
	private int minimumPoints;
	private int maximumPoints;
	private String repLevel;
	private String faction;
	
	//Constructor
	RepLevels(int ID, int minPts, int maxPts, String repLVL, String faction) {
		setID(ID);
		setMinimumPoints(minPts);
		setMaximumPoints(maxPts);
		setRepLevel(repLVL);
		setFaction(faction);
	}
	
	//Getters
	public int getID() {
		return id;
	}
	
	public int getMinimumPoints() {
		return minimumPoints;
	}
	
	public int getMaximumPoints() {
		return maximumPoints;
	}
	
	public String getRepLevel() {
		return repLevel;
	}
	
	public String getFaction() {
		return faction;
	}
	
	//Setters
	public void setID(int ID) {
		this.id = ID;
	}
	
	public void setMinimumPoints(int minPts) {
		this.minimumPoints = minPts;
	}
	
	public void setMaximumPoints(int maxPts) {
		this.maximumPoints = maxPts;
	}
	
	public void setRepLevel(String repLVL) {
		this.repLevel = repLVL;
	}
	
	public void setFaction(String faction) {
		this.faction = faction;
	}

}
