package com.e3mall.mapper;

import com.e3mall.pojo.TbItemParam;
import com.e3mall.pojo.TbItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {
    long countByExample(TbItemParamExample example);

    int deleteByExample(TbItemParamExample example);

    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);

    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    List<TbItemParam> selectByExample(TbItemParamExample example);

    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);
}