package com.qingqi.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sun.security.acl.AclEntryImpl;

import java.util.List;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
public interface EIRepository extends JpaRepository<EI,Long>{

    //用于辅助用户查询，返回某用户的所有EI表中的快递消息
    @Query("select p from EI p where p.userid=:userid")
    List<EI> withUseridQuery(@Param("userid")Long userid);

    //用于辅助后台查询，返回所有EI表中处于某种状态下的消息
    @Query("select p from EI p where p.state=:state")
    List<EI> withStateQuery(@Param("state")Long state);

    //删除EI表中的某条数据
    @Query(value = "delete from EI where id=?1 and userid=?2", nativeQuery = true)
    public void deleteOrderById(Long id, Long userid);

}
