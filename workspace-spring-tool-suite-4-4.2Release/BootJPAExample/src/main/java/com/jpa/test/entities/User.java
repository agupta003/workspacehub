package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private String name;
		
		private String city;
		
		private String stutas;

		
		public User(int id, String name, String city, String stutas) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.stutas = stutas;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStutas() {
			return stutas;
		}

		public void setStutas(String stutas) {
			this.stutas = stutas;
		}

		

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", city=" + city + ", stutas=" + stutas + "]";
		}


}
