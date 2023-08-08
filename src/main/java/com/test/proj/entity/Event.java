package com.test.proj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Table(name = "event")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "organizer")
    private String organizer;

    @Column(name = "eventDate")
    private Date eventDate;

    @Column(name = "startTime")
    private Date startTime;

    @Column(name = "endTime")
    private Date endTime;

    @Column(name = "minNumParticipants")
    private int minNumParticipants;

    @Column(name = "maxNumParticipants")
    private int maxNumParticipants;

}
