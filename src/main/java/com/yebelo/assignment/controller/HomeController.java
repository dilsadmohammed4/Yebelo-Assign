package com.yebelo.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yebelo.assignment.entities.NumbersData;
import com.yebelo.assignment.service.HomeService;

/**
 * HomeController
 */
@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/FetchNextNumber/{idNum}")
    public String FetchNextNumber(@PathVariable("idNum") Long idNum, NumbersData numbersData) {
        String digitSum = homeService.DigitSum(idNum, numbersData);

        return digitSum;

    }
    @PostMapping("/FetchNextNumber")
    public NumbersData FetchNextNumber(@RequestBody NumbersData numbersData) {

        return homeService.save(numbersData);

    }
}