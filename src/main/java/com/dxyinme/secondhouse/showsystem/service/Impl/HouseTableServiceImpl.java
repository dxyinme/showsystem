package com.dxyinme.secondhouse.showsystem.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dxyinme.secondhouse.showsystem.mapper.HouseTableMapper;
import com.dxyinme.secondhouse.showsystem.model.HouseTableExample;
import com.dxyinme.secondhouse.showsystem.model.HouseTable;
import com.dxyinme.secondhouse.showsystem.service.HouseTableService;
@Service
public class HouseTableServiceImpl implements HouseTableService{

    @Resource
    private HouseTableMapper houseTableMapper;

    @Override
    public long countByExample(HouseTableExample example) {
        return houseTableMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(HouseTableExample example) {
        return houseTableMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String houseId) {
        return houseTableMapper.deleteByPrimaryKey(houseId);
    }

    @Override
    public int insert(HouseTable record) {
        return houseTableMapper.insert(record);
    }

    @Override
    public int insertSelective(HouseTable record) {
        return houseTableMapper.insertSelective(record);
    }

    @Override
    public List<HouseTable> selectByExample(HouseTableExample example) {
        return houseTableMapper.selectByExample(example);
    }

    @Override
    public HouseTable selectByPrimaryKey(String houseId) {
        return houseTableMapper.selectByPrimaryKey(houseId);
    }

    @Override
    public int updateByExampleSelective(HouseTable record,HouseTableExample example) {
        return houseTableMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(HouseTable record,HouseTableExample example) {
        return houseTableMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(HouseTable record) {
        return houseTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HouseTable record) {
        return houseTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<HouseTable> list) {
        return houseTableMapper.batchInsert(list);
    }

}
