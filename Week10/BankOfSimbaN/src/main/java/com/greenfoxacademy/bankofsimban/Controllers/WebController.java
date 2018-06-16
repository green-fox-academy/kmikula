package com.greenfoxacademy.bankofsimban.Controllers;

import com.greenfoxacademy.bankofsimban.Models.BankAccount;
import com.greenfoxacademy.bankofsimban.Services.BankTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;

@Controller
public class WebController {

    BankTransactions bankTransactions;

    @Autowired
    public WebController(BankTransactions bankTransactions) {
        this.bankTransactions = bankTransactions;
    }


    @GetMapping("/show")
    public String showAccount(Model model) {
        BankAccount bankAccount = new BankAccount("Simba", (double) 2000, "lion", true, true);
        DecimalFormat df = new DecimalFormat("####0.00");
        double formattedBalance = Double.valueOf(df.format(bankAccount.getBalance()));

        model.addAttribute("name", "Simba");
        model.addAttribute("balance", formattedBalance);
        model.addAttribute("animalType", "lion");
        return "showAccount";
    }

    @GetMapping("/strings")
    public String displayString(Model model) {
        model.addAttribute("display", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "displayString";
    }

    @GetMapping("/list")
    public String displayAccounts(Model model) {
        BankAccount bankAcc1 = new BankAccount("Zazu", 500.25, "bird", false, true);
        BankAccount bankAcc2 = new BankAccount("Nala", 800.05, "lion", true, true);
        BankAccount bankAcc3 = new BankAccount("Rafiki", 430.02, "monkey", false, true);
        BankAccount bankAcc4 = new BankAccount("Scar", 300.04, "meerkat", false, false);

        bankTransactions.addBankAccount(bankAcc1);
        bankTransactions.addBankAccount(bankAcc2);
        bankTransactions.addBankAccount(bankAcc3);
        bankTransactions.addBankAccount(bankAcc4);

        model.addAttribute("accountList", bankTransactions.getAllAccounts());
        return "accountList";
    }
}
