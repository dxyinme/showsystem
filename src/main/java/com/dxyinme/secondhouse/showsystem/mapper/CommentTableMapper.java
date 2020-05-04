package com.dxyinme.secondhouse.showsystem.mapper;

import com.dxyinme.secondhouse.showsystem.model.CommentTable;
import com.dxyinme.secondhouse.showsystem.model.CommentTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentTableMapper {
    long countByExample(CommentTableExample example);

    int deleteByExample(CommentTableExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(CommentTable record);

    int insertSelective(CommentTable record);

    List<CommentTable> selectByExample(CommentTableExample example);

    CommentTable selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") CommentTable record, @Param("example") CommentTableExample example);

    int updateByExample(@Param("record") CommentTable record, @Param("example") CommentTableExample example);

    int updateByPrimaryKeySelective(CommentTable record);

    int updateByPrimaryKey(CommentTable record);

    int batchInsert(@Param("list") List<CommentTable> list);
}