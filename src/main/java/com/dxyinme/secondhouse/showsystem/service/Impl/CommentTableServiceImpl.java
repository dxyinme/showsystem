package com.dxyinme.secondhouse.showsystem.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dxyinme.secondhouse.showsystem.mapper.CommentTableMapper;
import com.dxyinme.secondhouse.showsystem.model.CommentTable;
import com.dxyinme.secondhouse.showsystem.model.CommentTableExample;
import com.dxyinme.secondhouse.showsystem.service.CommentTableService;

@Service
public class CommentTableServiceImpl implements CommentTableService {

    @Resource
    private CommentTableMapper commentTableMapper;

    @Override
    public long countByExample(CommentTableExample example) {
        return commentTableMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CommentTableExample example) {
        return commentTableMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long commentId) {
        return commentTableMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(CommentTable record) {
        return commentTableMapper.insert(record);
    }

    @Override
    public int insertSelective(CommentTable record) {
        return commentTableMapper.insertSelective(record);
    }

    @Override
    public List<CommentTable> selectByExample(CommentTableExample example) {
        return commentTableMapper.selectByExample(example);
    }

    @Override
    public CommentTable selectByPrimaryKey(Long commentId) {
        return commentTableMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByExampleSelective(CommentTable record, CommentTableExample example) {
        return commentTableMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CommentTable record, CommentTableExample example) {
        return commentTableMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentTable record) {
        return commentTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommentTable record) {
        return commentTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<CommentTable> list) {
        return commentTableMapper.batchInsert(list);
    }

}

