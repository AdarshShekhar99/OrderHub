package com.service.ordering.order.controller;


import com.service.ordering.order.Enum.Status;
import com.service.ordering.order.dto.RequestDto.OrderRequestDto;
import com.service.ordering.order.dto.ResponseDto.OrderResponseDto;
import com.service.ordering.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @Value("${test:false}")
    private boolean test;

    @PostMapping("/create")
    public ResponseEntity<OrderResponseDto> createOrder(@RequestBody OrderRequestDto orderRequestDto){
        if (test) {
            OrderResponseDto dummyResponse = new OrderResponseDto();
            dummyResponse.setOrderId(101);
            dummyResponse.setOrderStatus(Status.CREATED);
            dummyResponse.setTotalAmount(1000);
            // Populate additional dummy fields as needed.
            return new ResponseEntity<>(dummyResponse, HttpStatus.CREATED);
        }

        OrderResponseDto systemResponse = orderService.createOrdering(orderRequestDto);

        //Exception are handled globally no need to handle it and no need to use any try catch block.
        return new ResponseEntity<>(systemResponse , HttpStatus.CREATED);

    }




}
