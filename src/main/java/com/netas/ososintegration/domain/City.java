package com.netas.ososintegration.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city", schema="osos_app")
public class City {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String name;

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
    
    
}
