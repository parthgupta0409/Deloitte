package com.sonar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr" , name="ADDRESS")
public class Address {

	    private int customerId;
		@Id
		@Column(name="id")
		private int addressId;
		
		private String deliveryAddress;
		
		private String city;
		
		private String state;
		
		private int pincode;

		public int getId() {
			return addressId;
		}

		public Address() {
			super();
		}

		public Address(int customerId, int addressId, String deliveryAddress, String city, String state, int pincode) {
			super();
			this.customerId = customerId;
			this.addressId = addressId;
			this.deliveryAddress = deliveryAddress;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getDeliveryAddress() {
			return deliveryAddress;
		}

		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((state == null) ? 0 : state.hashCode());
			result = prime * result + addressId;
			result = prime * result + ((city == null) ? 0 : city.hashCode());
			result = prime * result + customerId;
			result = prime * result + ((deliveryAddress == null) ? 0 : deliveryAddress.hashCode());
			result = prime * result + pincode;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			if (state == null) {
				if (other.state != null)
					return false;
			} else if (!state.equals(other.state))
				return false;
			if (addressId != other.addressId)
				return false;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
				return false;
			if (customerId != other.customerId)
				return false;
			if (deliveryAddress == null) {
				if (other.deliveryAddress != null)
					return false;
			} else if (!deliveryAddress.equals(other.deliveryAddress))
				return false;
			if (pincode != other.pincode)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Address [customerId=" + customerId + ", addressId=" + addressId + ", deliveryAddress="
					+ deliveryAddress + ", city=" + city + ", State=" + state + ", pincode=" + pincode + "]";
		}

		
}

