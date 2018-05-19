package cn.group.category.dao;

import cn.group.category.pojo.PropertyAppend;
import cn.group.category.pojo.PropertyAppendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PropertyAppendMapper {
    long countByExample(PropertyAppendExample example);

    int deleteByExample(PropertyAppendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropertyAppend record);

    int insertSelective(PropertyAppend record);

    List<PropertyAppend> selectByExample(PropertyAppendExample example);

    PropertyAppend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropertyAppend record, @Param("example") PropertyAppendExample example);

    int updateByExample(@Param("record") PropertyAppend record, @Param("example") PropertyAppendExample example);

    int updateByPrimaryKeySelective(PropertyAppend record);

    int updateByPrimaryKey(PropertyAppend record);
}