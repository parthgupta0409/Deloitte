package com.pms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(schema="hr",name="Product4444")
	public class Product{
		@Id
		private int productId;
		@Column
		private String productName;
		@Column
		private int quantity;
		@Column
		private int price;
		
		public Product() {
			
		}

		public Product(int productId, String productName, int quantity, int price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.quantity = quantity;
			this.price = price;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (price != other.price)
				return false;
			if (productId != other.productId)
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (quantity != other.quantity)
				return false;
			return true;
		}

		public int getPrice() {
			return price;
		}

		public int getProductId() {
			return productId;
		}

		public String getProductName() {
			return productName;
		}

		public int getQuantity() {
			return quantity;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + price;
			result = prime * result + productId;
			result = prime * result + ((productName == null) ? 0 : productName.hashCode());
			result = prime * result + quantity;
			return result;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
					+ ", price=" + price + "]";
		}
		
	}

