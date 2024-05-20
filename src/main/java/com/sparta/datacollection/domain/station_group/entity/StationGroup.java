package com.sparta.datacollection.domain.station_group.entity;

import com.sparta.datacollection.global.entity.Timestamped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "station_group_tb")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StationGroup extends Timestamped {

    @Id
    @Column(name = "station_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stationGroupId;

    @Column(name = "serial_number")
    private String serialNumber;

    public StationGroup(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
