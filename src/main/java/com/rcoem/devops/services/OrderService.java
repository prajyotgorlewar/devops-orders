package com.rcoem.devops.services;

import com.rcoem.devops.dto.OrderInfo;
import com.rcoem.devops.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    OrderInfoRepository orderInfoRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<OrderInfo> getAllOrders(){
        return orderInfoRepository.getAllOrders();
    }
    public OrderInfo createUser(OrderInfo userInfo){
        return orderInfoRepository.createUser(userInfo);
    }
    public OrderInfo getUser(String id)
    {
        return orderInfoRepository.getUserById(id);
    }

}
