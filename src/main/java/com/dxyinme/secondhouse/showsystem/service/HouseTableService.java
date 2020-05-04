package com.dxyinme.secondhouse.showsystem.service;

import java.util.List;
import com.dxyinme.secondhouse.showsystem.model.HouseTableExample;
import com.dxyinme.secondhouse.showsystem.model.HouseTable;
public interface HouseTableService{


    long countByExample(HouseTableExample example);

    int deleteByExample(HouseTableExample example);

    int deleteByPrimaryKey(String houseId);

    int insert(HouseTable record);

    int insertSelective(HouseTable record);

    List<HouseTable> selectByExample(HouseTableExample example);

    HouseTable selectByPrimaryKey(String houseId);

    int updateByExampleSelective(HouseTable record,HouseTableExample example);

    int updateByExample(HouseTable record,HouseTableExample example);

    int updateByPrimaryKeySelective(HouseTable record);

    int updateByPrimaryKey(HouseTable record);

    int batchInsert(List<HouseTable> list);

}
