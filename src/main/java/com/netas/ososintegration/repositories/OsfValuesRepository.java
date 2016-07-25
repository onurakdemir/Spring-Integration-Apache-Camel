package com.netas.ososintegration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.netas.ososintegration.domain.OsfValues;

public interface OsfValuesRepository  extends CrudRepository<OsfValues, Integer>{
    
	List<OsfValues> findByMeterid(String meterId);
}
