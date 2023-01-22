package org.abodah.auth.controller;

import org.abodah.auth.model.HistoryModel;
import org.abodah.auth.model.InfoModel;
import org.abodah.auth.model.LoginModel;
import org.abodah.auth.model.LoginResponse;
import org.abodah.auth.response.ResponseHandler;
import org.abodah.auth.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("")
@Validated
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity login (@Valid  @RequestBody LoginModel loginModel){
        // login
        System.out.println(loginModel);
        LoginResponse response = new LoginResponse();
        response.setLogin("test");
        response.setFirst_name("First");
        response.setLast_name("Last");
        response.setToken("token");
        return ResponseHandler.generateResponse("", "ok", response);
    }

    @GetMapping("checkLogin")
    public void checkLogin (@PathVariable("login") String login){
        // login
    }

    @PostMapping("history")
    public ResponseEntity history(@RequestBody HistoryModel history){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

    @PostMapping("info")
    public ResponseEntity info(@RequestBody InfoModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

    @PostMapping("templates")
    public ResponseEntity templates(@RequestBody HistoryModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }


}
