package com.sparta.datacollection.domain.device.entity;

import com.sparta.datacollection.domain.station_group.entity.StationGroup;
import com.sparta.datacollection.global.entity.Timestamped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "device_tb")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Device extends Timestamped {

    @Id
    @Column(name = "device_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deviceId;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "station_group_id")
    private Long stationGroupId;
}
