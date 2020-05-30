package com.dxyinme.secondhouse.showsystem.Controller;

import com.dxyinme.secondhouse.showsystem.Const.CONSTLIST;
import com.dxyinme.secondhouse.showsystem.HttpResponse.HttpResponse;
import com.dxyinme.secondhouse.showsystem.model.CommentTable;
import com.dxyinme.secondhouse.showsystem.service.CommentTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"评论控件"})
@RestController
@CrossOrigin // 允许外部访问
public class CommentController {

    @Autowired
    private CommentTableService commentTableService;

    @ApiOperation(value = "按照commentId返回评论" , response = HttpResponse.class)
    @GetMapping(value = "comment/getCommentById")
    public HttpResponse getCommentById(
            @RequestParam(value = "commentId") Long commentId
    ){
        CommentTable comment = commentTableService.selectByPrimaryKey(commentId);
        if(comment == null) return new HttpResponse(CONSTLIST.FAIL , "fail");
        return new HttpResponse(CONSTLIST.OK , "ok" ,comment);
    }

}