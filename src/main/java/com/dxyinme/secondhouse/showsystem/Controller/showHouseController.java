package com.dxyinme.secondhouse.showsystem.Controller;


import com.dxyinme.secondhouse.showsystem.HttpResponse.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Api(tags = {"房源展示接口"})
@RestController
public class showHouseController {

    @ApiOperation(value = "test" , response = HttpResponse.class)
    @GetMapping(value = "showhouse/test")
    public HttpResponse test(){
        return new HttpResponse(200,"1");
    }

    

}
