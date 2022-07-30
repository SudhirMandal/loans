package com.sudhir.loans.controllers;

import com.sudhir.loans.entities.Loans;
import com.sudhir.loans.repos.LoansRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
@Slf4j
public class LoansController {
    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/save")
    public Loans save(@RequestBody Loans loan) {
        loansRepository.save(loan);
        log.info("Account created with ID: " + loan.getLoanId());
        return loan;
    }

    @GetMapping
    public List<Loans> getAccounts(){
        return  loansRepository.findAll();
    }

}
