package com.project.SunShine.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="g-id")
	private Integer id;
	@Column
	private String name;
	@Column
	private String contact;
	@Column
	private String address;
	@Column
	private String eMail;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="r-id", referencedColumnName = "r-id")
	private Rooms rooms;
	
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", eMail="
				+ eMail + "]";
	}
	
	public Rooms getRooms() {
		return rooms;
	}

	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
}
