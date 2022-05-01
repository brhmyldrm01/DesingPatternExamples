package builder.example;

public class House {

	private String roof;
	private String basement;
	private String walls;
	
	
	/**
	 * @return the roof
	 */
	public String getRoof() {
		return roof;
	}
	/**
	 * @param roof the roof to set
	 */
	public void setRoof(String roof) {
		this.roof = roof;
	}
	/**
	 * @return the basement
	 */
	public String getBasement() {
		return basement;
	}
	/**
	 * @param basement the basement to set
	 */
	public void setBasement(String basement) {
		this.basement = basement;
	}
	/**
	 * @return the walls
	 */
	public String getWalls() {
		return walls;
	}
	/**
	 * @param walls the walls to set
	 */
	public void setWalls(String walls) {
		this.walls = walls;
	}
	@Override
	public String toString() {
		return "House [roof=" + roof + ", basement=" + basement + ", walls=" + walls + "]";
	}
	
	
	
	
	
}
