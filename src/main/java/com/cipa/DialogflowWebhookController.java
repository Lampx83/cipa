package com.cipa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class DialogflowWebhookController {

    @Autowired
    private MyDialogFlowApp myDialogFlowApp;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = { "application/json" })
    String serveAction(@RequestBody String body, @RequestHeader Map<String, String> headers) {
        try {
            return myDialogFlowApp.handleRequest(body, headers).get();
        } catch (InterruptedException | ExecutionException e) {
            return handleError(e);
        }
    }

    private String handleError(Exception e) {
        e.printStackTrace();
        return "Error handling the intent - " + e.getMessage();
    }

}