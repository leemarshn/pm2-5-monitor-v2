package com.kaiote.pm25monitor.Repository;


import com.kaiote.pm25monitor.Model.PMValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PMValueRepository extends CrudRepository<PMValue, Long> {

    List<PMValue> findPMValueByAnchorId(Long anchorId);
}
