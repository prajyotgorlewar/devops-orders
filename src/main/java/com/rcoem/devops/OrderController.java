package com.rcoem.devops;

import com.rcoem.devops.dto.OrderInfo;
import com.rcoem.devops.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class OrderController {
    @Autowired
    OrderService userService;
    @GetMapping()
    List<OrderInfo> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping()
    OrderInfo createUser(@RequestBody OrderInfo userInfo){
        return userService.createUser(userInfo);
    }

    @GetMapping("/{id}")
    ResponseEntity<OrderInfo> getUserById(@PathVariable("id") String id){
        try{
            return ResponseEntity.ok().body(userService.getUser(id));
        }
        catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
