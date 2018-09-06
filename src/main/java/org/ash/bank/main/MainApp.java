package org.ash.bank.main;

import org.ash.bank.config.DataConfig;
import org.ash.bank.entity.Bank;
import org.ash.bank.entity.Worker;
import org.ash.bank.service.impl.BankServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataConfig.class);

        System.out.println("Bean names: " +
                Arrays.toString(applicationContext.getBeanNamesForType(Worker.class)));

        Bank bank = (Bank) applicationContext.getBean("bank");
//        Bank bank = (Bank) applicationContext.getBean(org.ash.bank.entity.Bank.class);

        bank.setName("PriorBank");

        BankServiceImpl bankService = (BankServiceImpl) applicationContext.getBean(BankServiceImpl.class);
        bankService.addBank(bank);

    }
}
