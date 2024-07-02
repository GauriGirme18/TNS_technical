package Day5;

public class State extends Country{
	
	private String stateName;
	private String lang;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", lang=" + lang + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	

}
