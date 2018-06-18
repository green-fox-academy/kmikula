package com.greenfoxacademy.bankofsimban.Services;

import com.greenfoxacademy.bankofsimban.Models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankTransactions {

    void addBankAccount(BankAccount bankAccount);

    void createAccounts();

    ArrayList<BankAccount> getAllAccounts();

    double increaseBalance(String name);

}
