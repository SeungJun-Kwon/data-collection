package com.sparta.datacollection.domain.station_group.dto;

import com.sparta.datacollection.domain.station_group.entity.StationGroup;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterStationGroupResponse {

    private Long stationGroupId;
    private String serialNumber;
    private LocalDateTime createdAt;

    public RegisterStationGroupResponse(StationGroup stationGroup) {
        this.stationGroupId = stationGroup.getStationGroupId();
        this.serialNumber = stationGroup.getSerialNumber();
        this.createdAt = stationGroup.getCreatedAt();
    }
}
