/*
 * HelloController.java
 *
 * Copyright (c) 2023 Chip One Stop, Inc. All right reserved.
 * This software is the confidential and proprietary information of Chip One Stop, Inc.
 *
 */
package com.stackjava.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author GM
 */
@RestController
public class HelloController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}