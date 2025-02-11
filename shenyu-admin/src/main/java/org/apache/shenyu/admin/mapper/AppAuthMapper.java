/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.shenyu.admin.aspect.annotation.PageHelperMapperAnnotation;
import org.apache.shenyu.admin.model.entity.AppAuthDO;
import org.apache.shenyu.admin.model.query.AppAuthQuery;

import java.util.List;

/**
 * AppAuthMapper.
 */
@Mapper
public interface AppAuthMapper {

    /**
     * select application authority by id.
     *
     * @param id pk.
     * @return {@linkplain AppAuthDO}
     */
    AppAuthDO selectById(String id);

    /**
     * select application authority by query.
     *
     * @param appAuthQuery {@linkplain AppAuthQuery}
     * @return {@linkplain List}
     */
    @PageHelperMapperAnnotation
    List<AppAuthDO> selectByQuery(AppAuthQuery appAuthQuery);

    /**
     * select all.
     *
     * @return {@linkplain List}
     */
    List<AppAuthDO> selectAll();

    /**
     * count application authority by query.
     *
     * @param appAuthQuery {@linkplain AppAuthQuery}
     * @return {@linkplain Integer}
     */
    Integer countByQuery(AppAuthQuery appAuthQuery);

    /**
     * insert application authority.
     *
     * @param appAuthDO {@linkplain AppAuthDO}
     * @return rows int
     */
    int insert(AppAuthDO appAuthDO);

    /**
     * insert selective application authority.
     *
     * @param appAuthDO {@linkplain AppAuthDO}
     * @return rows int
     */
    int insertSelective(AppAuthDO appAuthDO);

    /**
     * update application authority.
     *
     * @param appAuthDO {@linkplain AppAuthDO}
     * @return rows int
     */
    int update(AppAuthDO appAuthDO);

    /**
     * Update enable int.
     *
     * @param appAuthDO the app auth do
     * @return the int
     */
    int updateEnable(AppAuthDO appAuthDO);


    /**
     * Update app secret by app key int.
     *
     * @param appKey    the app key
     * @param appSecret the app secret
     * @return the int
     */
    int updateAppSecretByAppKey(@Param("appKey") String appKey, @Param("appSecret") String appSecret);

    /**
     * update selective application authority.
     *
     * @param appAuthDO {@linkplain AppAuthDO}
     * @return rows int
     */
    int updateSelective(AppAuthDO appAuthDO);

    /**
     * deleteSelector application authority.
     *
     * @param id primary key.
     * @return rows int
     */
    int delete(String id);

    /**
     * Find by app key app auth do.
     *
     * @param appKey the app key
     * @return the app auth do
     */
    AppAuthDO findByAppKey(String appKey);
}
