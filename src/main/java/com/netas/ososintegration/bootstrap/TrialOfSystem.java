package com.netas.ososintegration.bootstrap;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.netas.ososintegration.domain.OsfValues;
import com.netas.ososintegration.repositories.MeterRepository;
import com.netas.ososintegration.repositories.OsfValuesRepository;

@Component
public class TrialOfSystem implements ApplicationListener<ContextRefreshedEvent> {

    private MeterRepository meterRepository;

    private OsfValuesRepository osfValuesRepository;
    
    private Logger log = Logger.getLogger(TrialOfSystem.class);

    @Autowired
    public void setMeterRepository(MeterRepository meterRepository) {
		this.meterRepository = meterRepository;
	}

    @Autowired
	public void setOsfValuesRepository(OsfValuesRepository osfValuesRepository) {
		this.osfValuesRepository = osfValuesRepository;
	}

	@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<OsfValues> osfData = osfValuesRepository.findByMeterid("110");
		
		
//		for ( Meter meter :meterRepository.findAll()) {
//    		System.out.println(meter.getTesisatno());
//    	}
    	
    }
}
