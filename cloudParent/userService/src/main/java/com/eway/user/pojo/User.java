package com.eway.user.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午5:56:17
* @ClassName 类名称：
* @Description 类描述：
*/
@Data
@Table(name="tb_user")
public class User {
    
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id ;
    @Column(name = "user_name")
    private String userName;
    private String name;
    private String password;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;
    @Transient
    private String note;
}
