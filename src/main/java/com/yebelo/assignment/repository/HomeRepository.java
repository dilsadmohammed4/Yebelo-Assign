package com.yebelo.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yebelo.assignment.entities.NumbersData;

@Repository
public interface HomeRepository extends JpaRepository<NumbersData, Long> {


}
