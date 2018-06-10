package com.greenfoxacademy.bankofsimban.Services;

import com.greenfoxacademy.bankofsimban.Models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankTransactionsImpl implements BankTransactions {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void addBankAccount(BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAccounts() {
        return bankAccounts;
    }
}
