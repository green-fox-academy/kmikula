package com.greenfoxacademy.bankofsimban.controllers;

import com.greenfoxacademy.bankofsimban.models.BankAccount;
import com.greenfoxacademy.bankofsimban.services.BankTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class WebController {

    BankTransactions bankTransactions;

    @Autowired
    public WebController(BankTransactions bankTransactions) {

        this.bankTransactions = bankTransactions;

        this.bankTransactions.createAccounts();
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

        model.addAttribute("accountList", bankTransactions.getAllAccounts());

        return "accountList";
    }

    @GetMapping("/form")
    public String renderForm() {

        return "form";
    }

    @PostMapping("/raiseBalance")
    public String increaseBalanceSubmit(@RequestParam(value = "name") String name, Model model) {
        bankTransactions.increaseBalance(name);

        return "redirect:/list";
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestParam(value = "newName") String newName,
                             @RequestParam(value = "balance") Double balance,
                             @RequestParam(value = "animalType") String animalType,
                             @RequestParam(value = "isKing") Boolean isKing,
                             @RequestParam(value = "goodGuy") Boolean goodGuy) {
        bankTransactions.addNewAccount(newName, balance, animalType, isKing, goodGuy);

        return "redirect:/list";
    }
}
