package com.yebelo.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yebelo.assignment.entities.NumbersData;
import com.yebelo.assignment.repository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeRepository homeRepository;

    @Override
    public String DigitSum(Long idNum, NumbersData numbersData) {

       numbersData = homeRepository.findById(idNum).get();

        int sum = 0;
        int n = Integer.parseInt(numbersData.getCategoryCode());

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        String valueSum = Integer.toString(sum);
        System.out.println("Sum of Digits " + sum);
        numbersData.setValue(valueSum);
        homeRepository.save(numbersData);
        return valueSum;
    }

    @Override
    public NumbersData save(NumbersData numbersData) {

        return homeRepository.save(numbersData);
    }

}
