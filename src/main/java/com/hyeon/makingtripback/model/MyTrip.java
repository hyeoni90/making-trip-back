package com.hyeon.makingtripback.model;

import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class MyTrip {

  private Long id;

  private Long userId;

  private String name;

  private String place;

  private Date departureAt;

  private Date arrivalAt;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;
}
