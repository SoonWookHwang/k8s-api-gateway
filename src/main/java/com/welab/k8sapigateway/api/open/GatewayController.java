package com.welab.k8sapigateway.api.open;

import com.welab.k8sapigateway.common.dto.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/gateway/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class GatewayController {
    @GetMapping(value = "/hello")
    public ApiResponseDto<String> test() {
        return ApiResponseDto.createOk("Hello World");
    }
}
