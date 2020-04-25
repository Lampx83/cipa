package com.cipa.service;

import com.cipa.DialogFlowApp;
import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.response.ResponseBuilder;
import com.google.api.services.actions_fulfillment.v2.model.BasicCard;
import com.google.api.services.actions_fulfillment.v2.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonenumberService {


    private DialogFlowApp dialogFlowApp;

    public PhonenumberService(DialogFlowApp dialogFlowApp) {
        this.dialogFlowApp = dialogFlowApp;
    }

    public ActionResponse phonenumber_lookup(ActionRequest request) {

        String text = "0937638683";
        BasicCard card = new BasicCard()
                .setTitle("Title: This is a title")
                .setSubtitle("This is a subtitle")
                .setFormattedText(text)
                .setImage(new Image()
                       .setUrl("http://phamxuanlam.appspot.com/img/DSC_5480.JPG")
                        .setAccessibilityText("Image alt text"));

        ResponseBuilder responseBuilder = dialogFlowApp.getResponseBuilder(request).add(text).add(card);
        ActionResponse actionResponse = responseBuilder.build();
        return actionResponse;
    }
}
