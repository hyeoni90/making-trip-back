package com.hyeon.makingtripback.service;

import com.hyeon.makingtripback.model.Schedule;
import com.hyeon.makingtripback.repositories.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> findSchedulesByMyTripId(Long myTripId) {
        return scheduleRepository.findSchedulesByMyTripId(myTripId);
    }

    public Schedule findById(Long id) {
        return scheduleRepository.findById(id).orElse(new Schedule());
    }

    public Schedule updateSchedule(Long id, Schedule schedule) {
        Schedule newSchedule = scheduleRepository.findById(id).orElse(schedule);
        return  scheduleRepository.save(newSchedule);
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
