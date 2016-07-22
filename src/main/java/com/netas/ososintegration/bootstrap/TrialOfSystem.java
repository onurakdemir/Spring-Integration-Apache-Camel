package com.netas.ososintegration.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.netas.ososintegration.domain.City;
import com.netas.ososintegration.domain.Meter;
import com.netas.ososintegration.repositories.CityRepository;
import com.netas.ososintegration.repositories.MeterRepository;

@Component
public class TrialOfSystem implements ApplicationListener<ContextRefreshedEvent> {

    private CityRepository cityRepository;
    private MeterRepository meterRepository;

    private Logger log = Logger.getLogger(TrialOfSystem.class);

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Autowired
    public void setMeterRepository(MeterRepository meterRepository) {
		this.meterRepository = meterRepository;
	}



	@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
		
		for ( Meter meter :meterRepository.findAll()) {
    		System.out.println(meter.getTesisatno());
    	}
    	
    	
//    	for ( City city :cityRepository.findAll()) {
//    		System.out.println(city.getName());
//    	}
    	
//    	City city1 = new City();
//    	city1.setId(1);
//    	city1.setName("Izmir");
//    	cityRepository.save(city1);
    }
}
