package net.robertwmurphy.stfc;

public class FactionMiningDailies {
	
	private int id;
	private String reputationLevel;
	private String rssGrade;
	private String rssLevelOne;
	private String rssLevelTwo;
	
	//Constructor
	FactionMiningDailies(int ID, String repLVL, String rssGrd, String rssLVLOne, String rssLVLTwo) {
		setID(ID);
		setReputationLevel(repLVL);
		setRSSGrade(rssGrd);
		setRSSLevelOne(rssLevelOne);
		setRSSLevelTwo(rssLevelTwo);
	}
	
	//Getters
	public int getID() {
		return id;
	}
	
	public String getReputationLevel() {
		return reputationLevel;
	}
	
	public String getRSSGrade() {
		return rssGrade;
	}
	
	public String getRSSLevelOne() {
		return rssLevelOne;
	}
	
	public String getRSSLevelTwo() {
		return rssLevelTwo;
	}
	
	//Setters
	public void setID(int ID) {
		this.id = ID;
	}
	
	public void setReputationLevel(String repLVL) {
		this.reputationLevel = repLVL;
	}
	
	public void setRSSGrade( String rssGrd) {
		this.rssGrade = rssGrd;
	}
	
	public void setRSSLevelOne(String rssLVLOne) {
		this.rssLevelOne = rssLVLOne;
	}
	
	public void setRSSLevelTwo(String rssLVLTwo) {
		this.rssLevelTwo = rssLVLTwo;
	}


}
