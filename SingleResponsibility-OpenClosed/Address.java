package SRPOCP;

public class Address {

	private String province;
	private String county;
	private String street;
	private int postalCode;
	
	
	
	
	
	
	public Address(String province, String county, String street, int postalCode) {
		super();
		this.province = province;
		this.county = county;
		this.street = street;
		this.postalCode = postalCode;
	}






	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}






	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}






	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}






	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}






	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}






	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}






	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}






	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}






	@Override
	public String toString() {
		return "Address [province=" + province + ", county=" + county + ", street=" + street + ", postalCode="
				+ postalCode + "]";
	}

	



	
	
	
}
