package _framework.mybatis.bean;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2025/3/8
 *                          @since  1.0
 *                          @author 12302
 *
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private Integer age;

    /**
     * account
     */
    private String account;

    /**
     * password
     */
    private String password;

    /**
     * time
     */
    private Date time;

}
