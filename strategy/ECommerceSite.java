package stategy;

public class ECommerceSite {
		private SiteType type;
		
	
		

		/**
		 * @return the type
		 */
		public SiteType getType() {
			return type;
		}


		/**
		 * @param type the type to set
		 */
		public void setType(SiteType type) {
			this.type = type;
		}


		public void calculatePrice(Double price) {
			System.out.println(type.calculatePrice(price));
		}
		

		public void getDesign() {
			System.out.println(type.getDesign());
		}
		
		
}
