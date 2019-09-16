package com.mit.artist.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "artist")
@Data
public class Artist {

  @Id
  @GeneratedValue
  private long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String gender;

  @Column(nullable = false)
  private LocalDate birthday;

  @Column(nullable = false)
  private LocalDateTime updateTime;

}
