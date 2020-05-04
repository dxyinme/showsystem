package com.dxyinme.secondhouse.showsystem.mapper;

import com.dxyinme.secondhouse.showsystem.model.HouseTable;
import com.dxyinme.secondhouse.showsystem.model.HouseTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseTableMapper {
    long countByExample(HouseTableExample example);

    int deleteByExample(HouseTableExample example);

    int deleteByPrimaryKey(String houseId);

    int insert(HouseTable record);

    int insertSelective(HouseTable record);

    List<HouseTable> selectByExample(HouseTableExample example);

    HouseTable selectByPrimaryKey(String houseId);

    int updateByExampleSelective(@Param("record") HouseTable record, @Param("example") HouseTableExample example);

    int updateByExample(@Param("record") HouseTable record, @Param("example") HouseTableExample example);

    int updateByPrimaryKeySelective(HouseTable record);

    int updateByPrimaryKey(HouseTable record);

    int batchInsert(@Param("list") List<HouseTable> list);
}