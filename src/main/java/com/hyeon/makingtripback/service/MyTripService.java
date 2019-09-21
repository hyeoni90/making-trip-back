package com.hyeon.makingtripback.service;

import com.hyeon.makingtripback.model.MyTrip;
import com.hyeon.makingtripback.repositories.MyTripRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MyTripService {

  private final MyTripRepository myTripRepository;

  public MyTripService(MyTripRepository myTripRepository) {
    this.myTripRepository = myTripRepository;
  }

  public List<MyTrip> findMyTripList() {
    return myTripRepository.findAll();
  }

  public MyTrip getMyTripById(Long id) {
    return myTripRepository.findById(id).orElse(new MyTrip());
  }

  public List<MyTrip> getMyTripByUser(Long userId) {
    return myTripRepository.findAllByUserIdOrderByCreatedAtDesc(userId);
  }
}
