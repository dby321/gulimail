package com.gulimail.gulimail.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimail.common.utils.PageUtils;
import com.gulimail.common.utils.Query;

import com.gulimail.gulimail.product.dao.CategoryDao;
import com.gulimail.gulimail.product.entity.CategoryEntity;
import com.gulimail.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList ( null );
        List<CategoryEntity> level1Menus = entities.stream ().filter ( (categoryEntity) -> {
            return categoryEntity.getParentCid () == 0;
        } ).map ( menu->{
            menu.setChildren (getChildren ( menu,entities  ) );
            return menu;
        } ).sorted ((menu1,menu2)->{
            return (menu1.getSort ()==null?0:menu1.getSort ()) - (menu2.getSort ()==null?0:menu2.getSort ());
        }).collect ( Collectors.toList () );

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
//TODO    1.检查当前删除的菜单，是否被别的地方引用
        baseMapper.deleteBatchIds ( asList );
    }

    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream ().filter ( categoryEntity -> {
            return categoryEntity.getParentCid () == root.getCatId ();
        } ).map ( categoryEntity -> {
            categoryEntity.setChildren ( getChildren ( categoryEntity, all ) );
            return categoryEntity;
        } ).sorted ( (menu1, menu2) -> {
            return (menu1.getSort ()==null?0:menu1.getSort ()) - (menu2.getSort ()==null?0:menu2.getSort ());
        } ).collect ( Collectors.toList () );
        return children;
    }
}