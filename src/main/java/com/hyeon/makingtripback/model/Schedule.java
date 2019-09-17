package com.hyeon.makingtripback.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long myTripId;

  private Long sequence;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

  @OneToMany(mappedBy = "schedule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Collection<ScheduleDetail> scheduleDetails;

  public void setScheduleDetails (
      Collection<ScheduleDetail> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
    scheduleDetails.forEach(scheduleDetail -> scheduleDetail.setSchedule(this));
  }
}
