package com.qingqi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/10/13 0013.
 * 微信小程序的物流信息表映射
 */
@Entity
public class EI {
    @Id
    @GeneratedValue
    private Long id;            //主键，目前没有实际意义
    private String awb;         //快递物流单号
    private String tel;         //用户的电话号码
    private String sms;         //用户收到快递公司的短信信息
    private String address;     //用户自己的收货地址
    private Long state;          //这条物流的状态：0表示轻骑未接单，1表示轻骑接单且在中午送货，2表示轻骑接单且在下午送货
    private Long userid;       //用户的唯一标识,外接主键

    public EI() {
    }

    public EI(String awb, String tel, String sms, String address, Long state, Long userid) {
        this.awb = awb;
        this.tel = tel;
        this.sms = sms;
        this.address = address;
        this.state = state;
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }
    

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
