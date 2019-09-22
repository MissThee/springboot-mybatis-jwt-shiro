package com.github.missthee.db.mapper.primary.manage;

import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Component;
import com.github.missthee.config.tkmapper.cache.MybatisRedisCacheConfig;
import com.github.missthee.config.tkmapper.common.CommonMapper;
import com.github.missthee.db.entity.primary.manage.UserRole;
@Component
@CacheNamespace(implementation= MybatisRedisCacheConfig.class)
public interface UserRoleMapper extends CommonMapper<UserRole> {

}