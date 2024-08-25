package com.nameui.spring_bank_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user 의 거래 내역과 잔고 정보를 반환하는 서비스
 */
@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "Here are the balance details from the DB";
    }
}
