package com.project.SunShine.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r-id")
	private Integer id;
	@Column
	private Integer floor;
	@Column
	private Integer roomNumer;
	@Column
	private Integer noBeds;
	@Column
	private String type;
	@Column
	private boolean AC;
	@Column
	private Integer price;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getRoomNumer() {
		return roomNumer;
	}
	public void setRoomNumer(Integer roomNumer) {
		this.roomNumer = roomNumer;
	}
	public Integer getNoBeds() {
		return noBeds;
	}
	public void setNoBeds(Integer noBeds) {
		this.noBeds = noBeds;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	 
}
