package org.gms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="CITIZEN")
public class Citizen {

	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer vaccinationCenterId;
	
}
