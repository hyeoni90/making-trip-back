package com.hyeon.makingtripback.controller;

import com.hyeon.makingtripback.model.MyTrip;
import com.hyeon.makingtripback.service.MyTripService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/add")
  public MyTrip addMyTrip(MyTrip myTrip) {
    return myTripService.save(myTrip);
  }
}
