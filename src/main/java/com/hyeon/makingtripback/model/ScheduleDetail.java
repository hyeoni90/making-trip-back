package com.hyeon.makingtripback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ScheduleDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false, targetEntity = Schedule.class)
  @JoinColumn(name = "schedule_id")
  @JsonBackReference
  private Schedule schedule;

  private String place;

  private String mapLat;

  private String mapLng;

  private String content;

  private String wayInfo;

  private Long sequence;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

}
