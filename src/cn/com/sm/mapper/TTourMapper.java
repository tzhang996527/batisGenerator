package cn.com.sm.mapper;

import cn.com.sm.po.TTour;
import cn.com.sm.po.TTourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTourMapper {
    int countByExample(TTourExample example);

    int deleteByExample(TTourExample example);

    int deleteByPrimaryKey(String tourid);

    int insert(TTour record);

    int insertSelective(TTour record);

    List<TTour> selectByExample(TTourExample example);

    TTour selectByPrimaryKey(String tourid);

    int updateByExampleSelective(@Param("record") TTour record, @Param("example") TTourExample example);

    int updateByExample(@Param("record") TTour record, @Param("example") TTourExample example);

    int updateByPrimaryKeySelective(TTour record);

    int updateByPrimaryKey(TTour record);
}