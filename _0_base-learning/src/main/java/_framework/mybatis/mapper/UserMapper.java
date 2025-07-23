package _framework.mybatis.mapper;

import java.util.List;

import _framework.mybatis.bean.User;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2025/3/8
 *                          @since  1.0
 *                          @author 12302
 *
 */
public interface UserMapper {

    User selectByName(String name);

    /**
     * 新增
     * @author BEJSON
     * @date 2025/03/07
     **/
    int insert(User user);

    /**
     * 刪除
     * @author BEJSON
     * @date 2025/03/07
     **/
    int delete(int id);

    /**
     * 更新
     * @author BEJSON
     * @date 2025/03/07
     **/
    int update(User user);

    /**
     * 查询 根据主键 id 查询
     * @author BEJSON
     * @date 2025/03/07
     **/
    User load(int id);

    /**
     * 查询 分页查询
     * @author BEJSON
     * @date 2025/03/07
     **/
    List<User> pageList(int offset, int pagesize);

    /**
     * 查询 分页查询 count
     * @author BEJSON
     * @date 2025/03/07
     **/
    int pageListCount(int offset,int pagesize);
}