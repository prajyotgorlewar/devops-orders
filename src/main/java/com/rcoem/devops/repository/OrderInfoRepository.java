package com.rcoem.devops.repository;

import com.rcoem.devops.dto.OrderInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class OrderInfoRepository {
    Map<String, OrderInfo> userInfoTable;

    @PostConstruct
    public void init() {
        userInfoTable = new HashMap<>();
    }
    public List<OrderInfo> getAllUsers(){
      return userInfoTable.values()
              .stream().collect(Collectors.toList());
    }
    public OrderInfo createUser(OrderInfo userInfo){
        String userId=UUID.randomUUID().toString();
       this.userInfoTable.put(userId,userInfo);
       return userInfo.toBuilder().id(userId).build();
    }

    public OrderInfo getUserById(String id) {
        return userInfoTable.get(id);
    }
}
