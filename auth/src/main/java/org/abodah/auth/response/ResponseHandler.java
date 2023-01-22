package org.abodah.auth.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String failedMessage, String successMessage, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("error", failedMessage);
        map.put("type", successMessage);
        map.put("data", responseObj);

        return new ResponseEntity<Object>(map,HttpStatus.OK);
    }
}
