package com.song.entity;

import javax.persistence.*;

@Entity
@Table(name = "xueguan")
public class xinnaoxueguan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String sex;
    String age;
    String zhiliaohou;
    String weizhiliao;
    String danguchun;
    String hdl;
    String yaowei;
    String xiyan;
    String tangniaobing;
    String quyu;
    String huanjin;
    String jiazu;
    String gailv;

    public xinnaoxueguan() {

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "xinnaoxueguan{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", zhiliaohou='" + zhiliaohou + '\'' +
                ", weizhiliao='" + weizhiliao + '\'' +
                ", danguchun='" + danguchun + '\'' +
                ", hdl='" + hdl + '\'' +
                ", yaowei='" + yaowei + '\'' +
                ", xiyan='" + xiyan + '\'' +
                ", tangniaobing='" + tangniaobing + '\'' +
                ", quyu='" + quyu + '\'' +
                ", huanjin='" + huanjin + '\'' +
                ", jiazu='" + jiazu + '\'' +
                ", gailv='" + gailv + '\'' +
                '}';
    }

    public xinnaoxueguan(String age, String zhiliaohou, String weizhiliao, String danguchun, String hdl, String yaowei, String xiyan, String tangniaobing, String quyu, String huanjin, String jiazu, String gailv) {
        this.age = age;
        this.zhiliaohou = zhiliaohou;
        this.weizhiliao = weizhiliao;
        this.danguchun = danguchun;
        this.hdl = hdl;
        this.yaowei = yaowei;
        this.xiyan = xiyan;
        this.tangniaobing = tangniaobing;
        this.quyu = quyu;
        this.huanjin = huanjin;
        this.jiazu = jiazu;
        this.gailv = gailv;
    }

    public String getGailv() {
        return gailv;
    }

    public void setGailv(String gailv) {
        this.gailv = gailv;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getZhiliaohou() {
        return zhiliaohou;
    }

    public void setZhiliaohou(String zhiliaohou) {
        this.zhiliaohou = zhiliaohou;
    }

    public String getWeizhiliao() {
        return weizhiliao;
    }

    public void setWeizhiliao(String weizhiliao) {
        this.weizhiliao = weizhiliao;
    }

    public String getDanguchun() {
        return danguchun;
    }

    public void setDanguchun(String danguchun) {
        this.danguchun = danguchun;
    }

    public String getHdl() {
        return hdl;
    }

    public void setHdl(String hdl) {
        this.hdl = hdl;
    }

    public String getYaowei() {
        return yaowei;
    }

    public void setYaowei(String yaowei) {
        this.yaowei = yaowei;
    }

    public String getXiyan() {
        return xiyan;
    }

    public void setXiyan(String xiyan) {
        this.xiyan = xiyan;
    }

    public String getTangniaobing() {
        return tangniaobing;
    }

    public void setTangniaobing(String tangniaobing) {
        this.tangniaobing = tangniaobing;
    }

    public String getQuyu() {
        return quyu;
    }

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }

    public String getHuanjin() {
        return huanjin;
    }

    public void setHuanjin(String huanjin) {
        this.huanjin = huanjin;
    }

    public String getJiazu() {
        return jiazu;
    }

    public void setJiazu(String jiazu) {
        this.jiazu = jiazu;
    }
}
