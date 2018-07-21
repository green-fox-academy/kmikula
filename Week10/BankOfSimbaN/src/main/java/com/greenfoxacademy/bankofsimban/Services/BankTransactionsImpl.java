package com.greenfoxacademy.bankofsimban.services;

import com.greenfoxacademy.bankofsimban.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankTransactionsImpl implements BankTransactions {
    BankAccount bankAccount = new BankAccount();

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public void createAccounts() {
        BankAccount bankAcc1 = new BankAccount("Zazu", 500.25, "bird", false, true);
        BankAccount bankAcc2 = new BankAccount("Nala", 800.00, "lion", true, true);
        BankAccount bankAcc3 = new BankAccount("Rafiki", 430.00, "monkey", false, true);
        BankAccount bankAcc4 = new BankAccount("Scar", 300.04, "meerkat", false, false);

        bankAccounts.add(bankAcc1);
        bankAccounts.add(bankAcc2);
        bankAccounts.add(bankAcc3);
        bankAccounts.add(bankAcc4);
    }

    @Override
    public ArrayList<BankAccount> getAllAccounts() {
        return bankAccounts;
    }

    @Override
    public double increaseBalance(String name) {
        Double balance = 0d;

        for (BankAccount bankAcc : bankAccounts) {

            if (bankAcc.getName().equals(name)) {

                if (bankAcc.isKing() == true) {
                    bankAcc.setBalance(bankAcc.getBalance() + 100);
                    balance = bankAcc.getBalance();
                } else {
                    bankAcc.setBalance(bankAcc.getBalance() + 10);
                    balance = bankAcc.getBalance();
                }
            }

        }
        return balance;
    }

    @Override
    public void addNewAccount(String newName, Double balance, String animalType, Boolean isKing, Boolean goodGuy) {
        BankAccount bankAccount1 = new BankAccount(newName, balance, animalType, isKing, goodGuy);

        bankAccounts.add(bankAccount1);
    }
}
