package com.sparta.datacollection.domain.station_group.service;

import com.sparta.datacollection.domain.station_group.dto.RegisterStationGroupRequest;
import com.sparta.datacollection.domain.station_group.dto.RegisterStationGroupResponse;
import com.sparta.datacollection.domain.station_group.entity.StationGroup;
import com.sparta.datacollection.domain.station_group.repository.StationGroupRepository;
import com.sparta.datacollection.global.dto.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StationGroupService {

    private final StationGroupRepository stationGroupRepository;

    public CommonResponse<RegisterStationGroupResponse> registerStationGroup(
        RegisterStationGroupRequest request) {
        if (request.getStationGroupSerial() == null || request.getStationGroupSerial().isEmpty()) {
            throw new IllegalArgumentException("장치 시리얼 넘버 값 오류");
        }

        StationGroup stationGroup = stationGroupRepository.save(
            new StationGroup(request.getStationGroupSerial()));

        RegisterStationGroupResponse response = new RegisterStationGroupResponse(stationGroup);

        return CommonResponse.ofResponse("success", response);
    }
}
