package com.sparta.spring_resttemplate_client.controller;


import com.sparta.spring_resttemplate_client.dto.ItemDto;
import com.sparta.spring_resttemplate_client.service.NaverApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NaverApiController {

    private final NaverApiService naverApiService;

    public NaverApiController(NaverApiService naverApiService) {
        this.naverApiService = naverApiService;
    }

    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query)  {
        return naverApiService.searchItems(query);
    }
}