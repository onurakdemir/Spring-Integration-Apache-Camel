package com.netas.ososintegration.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meter_mbs_data", schema="osos_app")
public class Meter {
    @Id
    private Integer id;
    
    private Integer tmx_meter_id;
    
    private String serialno;
    
    private String tesisatno;
    
    private String unvan;
    
    private Integer meter_type_id;
    
    private String meter_type;
    
    private Integer multiplier;
    
    private Integer contract_power;
    
    private Integer city_id;
    
    private String city_name;
    
    private Integer town_id;
    
    private String town_name;
    
    private Integer tariff_code;
    
    private String tariff_name;
    
    private Timestamp last_synch_time;
    
    private Integer replaced;
	
    private String vendor_name;
    
    private String vendor_type;
    
    private Integer uzlastirma_sayac_kodu;
    
    private String trafo_kodu;
    
    private Integer seyt_rate;
    
    private String note;
    
    private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTmx_meter_id() {
		return tmx_meter_id;
	}

	public void setTmx_meter_id(Integer tmx_meter_id) {
		this.tmx_meter_id = tmx_meter_id;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getTesisatno() {
		return tesisatno;
	}

	public void setTesisatno(String tesisatno) {
		this.tesisatno = tesisatno;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public Integer getMeter_type_id() {
		return meter_type_id;
	}

	public void setMeter_type_id(Integer meter_type_id) {
		this.meter_type_id = meter_type_id;
	}

	public String getMeter_type() {
		return meter_type;
	}

	public void setMeter_type(String meter_type) {
		this.meter_type = meter_type;
	}

	public Integer getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(Integer multiplier) {
		this.multiplier = multiplier;
	}

	public Integer getContract_power() {
		return contract_power;
	}

	public void setContract_power(Integer contract_power) {
		this.contract_power = contract_power;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Integer getTown_id() {
		return town_id;
	}

	public void setTown_id(Integer town_id) {
		this.town_id = town_id;
	}

	public String getTown_name() {
		return town_name;
	}

	public void setTown_name(String town_name) {
		this.town_name = town_name;
	}

	public Integer getTariff_code() {
		return tariff_code;
	}

	public void setTariff_code(Integer tariff_code) {
		this.tariff_code = tariff_code;
	}

	public String getTariff_name() {
		return tariff_name;
	}

	public void setTariff_name(String tariff_name) {
		this.tariff_name = tariff_name;
	}

	public Timestamp getLast_synch_time() {
		return last_synch_time;
	}

	public void setLast_synch_time(Timestamp last_synch_time) {
		this.last_synch_time = last_synch_time;
	}

	public Integer getReplaced() {
		return replaced;
	}

	public void setReplaced(Integer replaced) {
		this.replaced = replaced;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getVendor_type() {
		return vendor_type;
	}

	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}

	public Integer getUzlastirma_sayac_kodu() {
		return uzlastirma_sayac_kodu;
	}

	public void setUzlastirma_sayac_kodu(Integer uzlastirma_sayac_kodu) {
		this.uzlastirma_sayac_kodu = uzlastirma_sayac_kodu;
	}

	public String getTrafo_kodu() {
		return trafo_kodu;
	}

	public void setTrafo_kodu(String trafo_kodu) {
		this.trafo_kodu = trafo_kodu;
	}

	public Integer getSeyt_rate() {
		return seyt_rate;
	}

	public void setSeyt_rate(Integer seyt_rate) {
		this.seyt_rate = seyt_rate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
	
}
