package com.cipa;

import com.cipa.service.PhonenumberService;
import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DialogFlowApp extends DialogflowApp {
    @Autowired
    DialogFlowApp dialogFlowApp;

    @ForIntent("phonenumber_lookup") //Lampx
    public ActionResponse phonenumber_lookup(ActionRequest request) {
        return  new PhonenumberService(dialogFlowApp).phonenumber_lookup(request);
    }

}