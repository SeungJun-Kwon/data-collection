package com.sparta.datacollection.domain.station_group.controller;

import com.sparta.datacollection.domain.station_group.dto.RegisterStationGroupRequest;
import com.sparta.datacollection.domain.station_group.dto.RegisterStationGroupResponse;
import com.sparta.datacollection.domain.station_group.service.StationGroupService;
import com.sparta.datacollection.global.dto.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/station-groups")
@RequiredArgsConstructor
public class StationGroupController {

    private final StationGroupService stationGroupService;

    @PostMapping
    public CommonResponse<RegisterStationGroupResponse> registerStationGroup(
        @RequestBody RegisterStationGroupRequest request) {

        return stationGroupService.registerStationGroup(request);
    }
}
