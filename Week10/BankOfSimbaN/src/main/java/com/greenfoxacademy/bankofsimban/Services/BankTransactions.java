package com.greenfoxacademy.bankofsimban.Services;

import com.greenfoxacademy.bankofsimban.Models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankTransactions {

    public void addBankAccount(BankAccount bankAccount);

    ArrayList<BankAccount> getAllAccounts();

}
