package org.abodah.auth.controller;

import org.abodah.auth.model.HistoryModel;
import org.abodah.auth.response.ResponseHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WalletController {

    @PostMapping("wallets")
    public ResponseEntity wallets(@RequestBody HistoryModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

    @PostMapping("addWallet")
    public ResponseEntity addWallet(@RequestBody HistoryModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

    @PostMapping("removeWallet")
    public ResponseEntity removeWallet(@RequestBody HistoryModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

}
