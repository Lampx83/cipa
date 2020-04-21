package com.example.appengine.springboot;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyDialogFlowApp extends DialogflowApp {

    @ForIntent("phonenumber_lookup")
    public ActionResponse student(ActionRequest request) {
        ResponseBuilder responseBuilder = getResponseBuilder(request).add("0937638683");
        ActionResponse actionResponse = responseBuilder.build();
        return actionResponse;
    }

}