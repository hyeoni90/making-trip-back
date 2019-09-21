package com.hyeon.makingtripback.repositories;

import com.hyeon.makingtripback.model.MyTrip;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTripRepository extends CrudRepository<MyTrip, Long> {

  List<MyTrip> findAll();

  List<MyTrip> findAllByUserIdOrderByCreatedAtDesc(Long userId);
}
