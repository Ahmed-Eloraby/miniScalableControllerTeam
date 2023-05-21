package com.example.scalesquad.controller;

import com.example.scalesquad.controller.responses.ApiRequest;
import com.example.scalesquad.controller.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api",produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ControllerController {

    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/balabizo")
    public ApiResponse testPoint(@RequestBody ApiRequest request){
//        rabbitTemplate.convertAndSend("","user-registration",request);
        return new ApiResponse("ok");
    }
}
