package com.project.SunShine.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class rooms {

	private Integer floor;
	private Integer roomNumer;
	private Integer noBeds;
	private String type;
	private boolean AC;
	private Integer price;
}
