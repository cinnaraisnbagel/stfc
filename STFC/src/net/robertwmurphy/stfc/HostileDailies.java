package net.robertwmurphy.stfc;

public class HostileDailies {
	
	private int id;
	private String opsLevel;
	private String reputationLevel;
	private String hostileType;
	private String levelName;
	private String levelQty;
	private String hostileLevel;
	private String levelNameTwo;
	private String levelQtyTwo;
	private String hostileLevelTwo;
	private String levelNameThree;
	private String levelQtyThree;
	private String hostileLevelThree;
	
	//Constructors
	HostileDailies(int ID, String repLevel, String hostileTyp, String lvlName, String lvlQty, String hostileLVL, 
			String lvlNameTwo, String lvlQtyTwo, String hostileLVLTwo) {
		setID(ID);
		setReputationLevel(repLevel);
		setHostileType(hostileTyp);
		setLevelName(lvlName);
		setLevelQty(lvlQty);
		setHostileLevel(hostileLVL);
		setLevelNameTwo(lvlNameTwo);
		setLevelQtyTwo(lvlQtyTwo);
		setHostileLevelTwo(hostileLVLTwo);
	}
	
	HostileDailies(int ID, String opsLevel, String hostileTyp, String lvlName, String lvlQty, String hostileLVL, 
			String lvlNameTwo, String lvlQtyTwo, String hostileLVLTwo, String lvlNameThree, String lvlQtyThree, 
			String hostileLVLThree) {
		setID(ID);
		setOpsLevel(opsLevel);
		setHostileType(hostileTyp);
		setLevelName(lvlName);
		setLevelQty(lvlQty);
		setHostileLevel(hostileLVL);
		setLevelNameTwo(lvlNameTwo);
		setLevelQtyTwo(lvlQtyTwo);
		setHostileLevelTwo(hostileLVLTwo);
		setLevelNameThree(lvlNameThree);
		setLevelQtyThree(lvlQtyThree);
		setHostileLevelThree(hostileLVLThree);
	}
	
	//Getters
	public int getID() {
		return id;
	}
	
	public String getOpsLevel() {
		return opsLevel;
	}
	
	public String getReputationLevel() {
		return reputationLevel;
	}
	
	public String getHostileType() {
		return hostileType;
	}
	
	public String getLevelName() {
		return levelName;
	}
	
	public String getLevelQty() {
		return levelQty;
	}
	
	public String getHostileLevel() {
		return hostileLevel;
	}
	
	public String getLevelNameTwo() {
		return levelNameTwo;
	}
	
	public String getLevelQtyTwo() {
		return levelQtyTwo;
	}
	
	public String getHostileLevelTwo() {
		return hostileLevelTwo;
	}
	
	public String getLevelNameThree() {
		return levelNameThree;
	}
	
	public String getLevelQtyThree() {
		return levelQtyThree;
	}
	
	public String getHostileLevelThree() {
		return hostileLevelThree;
	}
	
	//Setters
	public void setID(int ID) {
		this.id = ID;
	}
	
	public void setOpsLevel(String opsLVL) {
		this.opsLevel = opsLVL;
	}
	
	public void setReputationLevel(String repLevel) {
		this.reputationLevel = repLevel;
	}
	
	public void setHostileType(String hostileTyp) {
		this.hostileType = hostileTyp;
	}
	
	public void setLevelName(String lvlName) {
		this.levelName = lvlName;
	}
	
	public void setLevelQty(String lvlQty) {
		this.levelQty = lvlQty;
	}
	
	public void setHostileLevel(String hostileLVL) {
		this.hostileLevel = hostileLVL;
	}
	
	public void setLevelNameTwo(String lvlNameTwo) {
		this.levelNameTwo = lvlNameTwo;
	}
	
	public void setLevelQtyTwo(String lvlQtyTwo) {
		this.levelQtyTwo = lvlQtyTwo;
	}
	
	public void setHostileLevelTwo(String hostileLVLTwo) {
		this.hostileLevelTwo = hostileLVLTwo;
	}
	
	public void setLevelNameThree(String lvlNameThree) {
		this.levelNameThree = lvlNameThree;
	}
	
	public void setLevelQtyThree(String lvlQtyThree) {
		this.levelQtyThree = lvlQtyThree;
	}
	
	public void setHostileLevelThree(String hostileLVLThree) {
		this.hostileLevelThree = hostileLVLThree;
	}
}