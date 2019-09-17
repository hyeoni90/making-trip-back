package com.hyeon.makingtripback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class CheckItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false, targetEntity = MyTrip.class)
  @JoinColumn(name = "my_trip")
  @JsonBackReference
  private MyTrip myTrip;

  private String content;

  private boolean state;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;
}
