package com.greenfoxacademy.bankofsimban.Services;

import com.greenfoxacademy.bankofsimban.Models.BankAccount;
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
    public void createAccounts(){
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
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getName().equals(name)) {

                if (this.bankAccount.isKing() == true) {
                    bankAccount.setBalance(bankAccount.getBalance() + 100);
                } else {
                    bankAccount.setBalance(bankAccount.getBalance() + 10);
                }
            }
        }
        return bankAccount.getBalance();
    }
}
