package com.dao;

import com.entity.TuanduiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TuanduiLiuyanView;

/**
 * 团队留言 Dao 接口
 *
 * @author 
 */
public interface TuanduiLiuyanDao extends BaseMapper<TuanduiLiuyanEntity> {

   List<TuanduiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
