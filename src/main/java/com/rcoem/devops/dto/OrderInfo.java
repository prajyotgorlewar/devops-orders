package com.rcoem.devops.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder(toBuilder = true)
public class OrderInfo {
    private String id;
    private String orderName;
    private String quantity;
    private String price;
    private String orderStatus;
    private List<String> orderItems;
}
