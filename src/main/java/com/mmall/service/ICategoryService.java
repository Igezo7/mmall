package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

/**
 * Created by igezo on 2018/5/13.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<java.util.List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
