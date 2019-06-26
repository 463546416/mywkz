package demo.com.entity;

public class House {
	
	// 编号, 房东,房屋描述,房屋价格,是否出租
		private int id;
		private String owner;
		private String description;
		private double price;
		private boolean isRent;

		public House(int id, String owner, String description, double price, boolean isRent) {
			super();
			this.id = id;
			this.owner = owner;
			this.description = description;
			this.price = price;
			this.isRent = isRent;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public boolean isRent() {
			return isRent;
		}

		public void setRent(boolean isRent) {
			this.isRent = isRent;
		}

}
