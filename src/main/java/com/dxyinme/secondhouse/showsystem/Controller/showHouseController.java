package com.dxyinme.secondhouse.showsystem.Controller;


import com.dxyinme.secondhouse.showsystem.Const.CONSTLIST;
import com.dxyinme.secondhouse.showsystem.HttpResponse.HttpResponse;
import com.dxyinme.secondhouse.showsystem.model.HouseTable;
import com.dxyinme.secondhouse.showsystem.model.HouseTableExample;
import com.dxyinme.secondhouse.showsystem.service.HouseTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(tags = {"房源展示接口"})
@RestController
public class showHouseController {

    @Autowired
    HouseTableService houseTableService;


    @ApiOperation(value = "test" , response = HttpResponse.class)
    @GetMapping(value = "showhouse/test")
    public HttpResponse test(){
        return new HttpResponse(200,"1");
    }

    @ApiOperation(value = "按照地址查询" , response = HttpResponse.class)
    @GetMapping(value = "/housesystem/location/{location}")
    public HttpResponse searchHouseByLocation(
            @PathVariable("location") String location
    ){
        HouseTableExample houseExp = new HouseTableExample();
        location = "%" + location + "%";
        houseExp.or().andHouseLocationLike(location);
        List<HouseTable> res = houseTableService.selectByExample(houseExp);
        if(res.size() == 0){
            return new HttpResponse(CONSTLIST.FAIL , "no result");
        }
        return new HttpResponse(CONSTLIST.OK , "load success" , res);
    }


    @ApiOperation(value = "按照户型查询" , response = HttpResponse.class)
    @GetMapping(value = "/housesystem/type/{type}")
    public HttpResponse searchHouseByType(
            @PathVariable("type") Integer Type
    ){
        HouseTableExample houseExp = new HouseTableExample();
        houseExp.or().andHouseTypeEqualTo(Type);
        List<HouseTable> res = houseTableService.selectByExample(houseExp);
        if(res.size() == 0){
            return new HttpResponse(CONSTLIST.FAIL , "no result");
        }
        return new HttpResponse(CONSTLIST.OK , "load success" , res);
    }


    @ApiOperation(value = "按照面积查询" , response = HttpResponse.class)
    @GetMapping(value = "/housesystem/Area/{minArea}-{maxArea}")
    public HttpResponse searchHouseByArea(
            @PathVariable("minArea") Integer minArea,
            @PathVariable("maxArea") Integer maxArea
    ){
        HouseTableExample houseExp = new HouseTableExample();
        houseExp.or().andHouseAreaBetween(minArea , maxArea);
        List<HouseTable> res = houseTableService.selectByExample(houseExp);
        if(res.size() == 0){
            return new HttpResponse(CONSTLIST.FAIL , "no result");
        }
        return new HttpResponse(CONSTLIST.OK , "load success" , res);
    }

    @ApiOperation(value = "按照楼层查询" , response = HttpResponse.class)
    @GetMapping(value = "/housesystem/Floor/{minFloor}-{maxFloor}")
    public HttpResponse searchHouseByFloor(
            @PathVariable("minFloor") Integer minFloor,
            @PathVariable("maxFloor") Integer maxFloor){
        HouseTableExample houseExp = new HouseTableExample();
        houseExp.or().andHouseFloorBetween(minFloor, maxFloor);
        List<HouseTable> res = houseTableService.selectByExample(houseExp);
        if(res.size() == 0){
            return new HttpResponse(CONSTLIST.FAIL , "no result");
        }
        return new HttpResponse(CONSTLIST.OK , "load success" , res);
    }


    @ApiOperation(value = "按照价格查询" , response = HttpResponse.class)
    @GetMapping(value = "/housesystem/Price/{minPrice}-{maxPrice}")
    public HttpResponse searchHouseByPrice(
            @PathVariable("minPrice") Integer minPrice,
            @PathVariable("maxPrice") Integer maxPrice){
        HouseTableExample houseExp = new HouseTableExample();
        houseExp.or().andHousePriceBetween(minPrice, maxPrice);
        List<HouseTable> res = houseTableService.selectByExample(houseExp);
        if(res.size() == 0){
            return new HttpResponse(CONSTLIST.FAIL , "no result");
        }
        return new HttpResponse(CONSTLIST.OK , "load success" , res);
    }



}
