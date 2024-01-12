package com.demo.iam.entrypoint.rest.routers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    @GetMapping("/users/{user_id}")
    public String getUser(@PathVariable String user_id) {
        return "Yes";
    }

}
