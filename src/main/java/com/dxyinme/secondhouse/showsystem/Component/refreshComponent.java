package com.dxyinme.secondhouse.showsystem.Component;



import com.dxyinme.secondhouse.showsystem.model.CommentTable;
import com.dxyinme.secondhouse.showsystem.model.HouseTable;
import com.dxyinme.secondhouse.showsystem.service.CommentTableService;

import com.dxyinme.secondhouse.showsystem.service.HouseTableService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class refreshComponent {

    @Autowired
    CommentTableService commentTableService;

    @Autowired
    HouseTableService houseTableService;

    @JmsListener(destination = "commentInsert2")
    public void togetherComment(String message){
        System.out.println("togetherComment:"  +  message);
        Gson gson = new Gson();
        CommentTable now = gson.fromJson(message,CommentTable.class);
        commentTableService.insert(now);
    }

    @JmsListener(destination = "houseInsert2")
    public void togetherHouse(String message){
        System.out.println("togetherHouse:" + message);
        houseTableService.insert(new Gson().fromJson(message , HouseTable.class));
    }
}
