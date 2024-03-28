package com.project.SunShine.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column
	private String name;
	@Column
	private Integer contact;
	@Column
	private String address;
	@Column
	private String eMail;
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", eMail="
				+ eMail + "]";
	}
	
	
	
}
