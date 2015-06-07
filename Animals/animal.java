
public class animal {
	private String sort;
	private String sound;

	public String getSound() {
		return sound;
	}

	public void setZvuk( String sound) {
		this.sound = sound;
	}
	
	public String getSort() {
		return sort;
	}

	public void setVrsta(String sort) {
		this.sort = sort;
	}

	public String toString() {
		return "Sort: " +sort+" \n"+"Sound: "+sound+"\n-----------------------";
	}
	
	
}
