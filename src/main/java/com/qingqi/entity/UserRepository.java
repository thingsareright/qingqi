package com.qingqi.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    //查询是否有某电话号码对应的账户
    public List<User> findAllByTel(String telnumber);
}
