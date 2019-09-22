package com.hyeon.makingtripback.controller;

import com.hyeon.makingtripback.model.Schedule;
import com.hyeon.makingtripback.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/list/{myTripId}")
    public List<Schedule> list(@PathVariable Long myTripId) {
        return scheduleService.findSchedulesByMyTripId(myTripId);
    }

    @GetMapping("/{id}")
    public Schedule findById(@PathVariable Long id) {
        return scheduleService.findById(id);
    }

    @PutMapping("/{id}")
    public Schedule updateSchedule(@PathVariable Long id, Schedule schedule) {
        return scheduleService.updateSchedule(id, schedule);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
    }

}
