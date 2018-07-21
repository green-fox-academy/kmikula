package com.greenfoxacademy.bankofsimban.services;

import com.greenfoxacademy.bankofsimban.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankTransactions {

    void addBankAccount(BankAccount bankAccount);

    void createAccounts();

    ArrayList<BankAccount> getAllAccounts();

    double increaseBalance(String name);

    void addNewAccount(String newName, Double balance, String animalType, Boolean isKing, Boolean goodGuy);

}
