package com.dao;

import com.entity.FangchanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangchanLiuyanView;

/**
 * 新房留言 Dao 接口
 *
 * @author 
 */
public interface FangchanLiuyanDao extends BaseMapper<FangchanLiuyanEntity> {

   List<FangchanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
