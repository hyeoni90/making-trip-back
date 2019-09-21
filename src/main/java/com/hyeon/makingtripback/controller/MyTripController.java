package com.hyeon.makingtripback.controller;

import com.hyeon.makingtripback.model.MyTrip;
import com.hyeon.makingtripback.service.MyTripService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trip")
public class MyTripController {

  private final MyTripService myTripService;

  public MyTripController(MyTripService myTripService) {
    this.myTripService = myTripService;
  }

  @GetMapping("/list")
  public List<MyTrip> myTripList() {
    return myTripService.findMyTripList();
  }

  @GetMapping("/{id}")
  public MyTrip getMyTripById(@PathVariable Long id) {
    return myTripService.getMyTripById(id);
  }

  @GetMapping("/user")
  public List<MyTrip> getMyTripByUserId(@RequestParam Long userId) {
    return myTripService.getMyTripByUser(userId);

  }
}
