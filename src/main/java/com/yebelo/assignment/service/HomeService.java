package com.yebelo.assignment.service;

import com.yebelo.assignment.entities.NumbersData;

/**
 * HomeService
 */
public interface HomeService {

    String DigitSum(Long idNum,NumbersData numbersData);

    NumbersData save(NumbersData numbersData);

}
