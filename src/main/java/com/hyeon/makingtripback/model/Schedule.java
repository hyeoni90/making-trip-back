package com.hyeon.makingtripback.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Entity
@Table(name = "schedule")
public class Schedule {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  private Long id;

  @Column(name = "booklet_info_id")
  private Long bookletInfoId;

  @Column(name = "`order`")
  private Long order;

  @CreationTimestamp
  @Column(name = "reg_date", updatable = false)
  private LocalDateTime regDate;

  @UpdateTimestamp
  @Column(name = "update_date")
  private LocalDateTime updateDate;

  @OneToMany(mappedBy = "schedule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Collection<ScheduleDetail> scheduleDetails;

  public void setScheduleDetails (
      Collection<ScheduleDetail> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
    scheduleDetails.forEach(scheduleDetail -> scheduleDetail.setSchedule(this));
  }
}
