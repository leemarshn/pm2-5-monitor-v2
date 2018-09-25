package com.kaiote.pm25monitor.Repository;

import com.kaiote.pm25monitor.Model.Anchor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnchorRepository extends CrudRepository<Anchor, Long> {
}
