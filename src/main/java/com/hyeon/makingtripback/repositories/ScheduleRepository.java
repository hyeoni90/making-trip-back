package com.hyeon.makingtripback.repositories;

import com.hyeon.makingtripback.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    List<Schedule> findSchedulesByMyTripId(Long myTripId);
}
