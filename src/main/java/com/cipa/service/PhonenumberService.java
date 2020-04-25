package com.cipa.service;

import com.cipa.DialogFlowApp;
import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.response.ResponseBuilder;
import com.google.api.services.actions_fulfillment.v2.model.BasicCard;
import com.google.api.services.actions_fulfillment.v2.model.Button;
import com.google.api.services.actions_fulfillment.v2.model.Image;
import com.google.api.services.actions_fulfillment.v2.model.OpenUrlAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhonenumberService {

    @Autowired
    private DialogFlowApp dialogFlowApp;

    public ActionResponse phonenumber_lookup(ActionRequest request) {
        String text = "0937638683";
        List<Button> buttons = new ArrayList<>();
        Button b = new Button();
        OpenUrlAction orl = new OpenUrlAction();
        orl.setUrl("urrl");
        orl.setUrl("hint");
        b.setOpenUrlAction(orl);
        b.setTitle("abc");

        BasicCard card = new BasicCard()
                .setTitle("Title: This is a title")
                .setSubtitle("This is a subtitle")
                .setFormattedText(text)
                .setImage(new Image()
                        .setUrl("http://phamxuanlam.appspot.com/img/DSC_5480.JPG")
                        .setAccessibilityText("Image alt text"))
                .setButtons(buttons);

        String[] sg = new String[]{"goi y 1"," goi y 2"};

        ResponseBuilder responseBuilder = dialogFlowApp.getResponseBuilder(request).add(text).add(card).addSuggestions(sg);
        ActionResponse actionResponse = responseBuilder.build();
        return actionResponse;
    }
}
