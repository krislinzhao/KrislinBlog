package cn.krislin.mall.dao;

import cn.krislin.mall.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品属性Dao
 * Created on 2018/5/23.
 */
public interface PmsProductAttributeDao {
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
