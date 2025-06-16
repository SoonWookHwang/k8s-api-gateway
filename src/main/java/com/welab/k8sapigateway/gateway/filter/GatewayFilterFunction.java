package com.welab.k8sapigateway.gateway.filter;

import org.springframework.cloud.gateway.server.mvc.common.Shortcut;
import org.springframework.web.servlet.function.HandlerFilterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.HandlerFilterFunction.ofRequestProcessor;

public interface GatewayFilterFunction {
    // @Shortcut: 이 어노테이션은 Spring Cloud Gateway (MVC)에서 필터 메서드를 DSL 또는 설정(YAML 등)에서
    // 간편하게 사용할 수 있도록 식별자(이름)로 등록해주는 역할을 한다.
    // 즉, 해당 메서드를 Java DSL 또는 application.yml 등에서 "addAuthenticationHeader"라는 이름으로
    // 직접 필터처럼 지정할 수 있도록 해주는 기능을 한다.
    // 이를 통해 사용자 정의 필터를 간결한 방식으로 라우트에 적용할 수 있다.
    @Shortcut //핵심 어노테이션 -
    static HandlerFilterFunction<ServerResponse, ServerResponse> addAuthenticationHeader() {
        return ofRequestProcessor(AuthenticationHeaderFilterFunction.addHeader());
    }
}
