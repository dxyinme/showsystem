package com.dxyinme.secondhouse.showsystem.service;

import java.util.List;
import com.dxyinme.secondhouse.showsystem.model.CommentTable;
import com.dxyinme.secondhouse.showsystem.model.CommentTableExample;

public interface CommentTableService {


    long countByExample(CommentTableExample example);

    int deleteByExample(CommentTableExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(CommentTable record);

    int insertSelective(CommentTable record);

    List<CommentTable> selectByExample(CommentTableExample example);

    CommentTable selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(CommentTable record, CommentTableExample example);

    int updateByExample(CommentTable record, CommentTableExample example);

    int updateByPrimaryKeySelective(CommentTable record);

    int updateByPrimaryKey(CommentTable record);

    int batchInsert(List<CommentTable> list);

}

