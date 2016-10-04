package com.netas.ososintegration.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="osf_values", schema="osos_app")
public class OsfValues {

    @Id
    private Integer id;
    
	private String year;
	
	private String month;
	
	private String day;
	
	private String hour;
	
	private String meter_id;
	
	private String flag;
	
	private Double result;

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMeter_id() {
		return meter_id;
	}

	public void setMeter_id(String meter_id) {
		this.meter_id = meter_id;
	}
	
	
}
