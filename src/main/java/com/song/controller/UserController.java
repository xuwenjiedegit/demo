package com.song.controller;

import com.song.entity.User;
import com.song.entity.xinnaoxueguan;
import com.song.service.UserService;
import org.aspectj.internal.lang.reflect.DeclareErrorOrWarningImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    private PrintWriter out = null;
    private DecimalFormat df = new DecimalFormat("#.00");


    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/panduanage")
    public void jianchaage(HttpServletRequest req, HttpServletResponse resp){
        String age=req.getParameter("age");
        if(age!=""&&!age.equals("")) {
    //        System.out.println(age);
             if(age.matches("-?\\d+")){
                 int ss = Integer.parseInt(age);
        //         System.out.println(ss);
                 if (ss > 100 || ss < 1) {
                     try {
                         out = resp.getWriter();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                     out.print("false");
                 } else {
                     try {
                         out = resp.getWriter();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                     out.print("ok");
                 }
             }

        }
    }
    @RequestMapping(value = "/panduanyaowei")
    public void jianchaage1(HttpServletRequest req, HttpServletResponse resp){
        String age=req.getParameter("age");
        if(age!=""&&!age.equals("")) {
            //        System.out.println(age);
            if(age.matches("-?\\d+")){
                int ss = Integer.parseInt(age);
                //         System.out.println(ss);
                if (ss > 140 || ss < 1) {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("false");
                } else {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("ok");
                }
            }

        }
    }

    @RequestMapping(value = "/panduanzhiliaohou")
    public void jianchazhiliaohou(HttpServletRequest req, HttpServletResponse resp){
        String age=req.getParameter("age");
  //      System.out.println(age);
        if(age!=""&&!age.equals("")) {
            if(age.matches("-?\\d+")) {
                int ss = Integer.parseInt(age);
    //            System.out.println(ss);
                if (ss > 210|| ss < 60) {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("false");
                } else {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("ok");
                }
            }
        }
    }

    @RequestMapping(value = "/hdl")
    public void jianchazhiliaohou1(HttpServletRequest req, HttpServletResponse resp){
        String age=req.getParameter("age");
        //      System.out.println(age);
        if(age!=""&&!age.equals("")) {
            if(age.matches("-?\\d+")) {
                int ss = Integer.parseInt(age);
                //            System.out.println(ss);
                if (ss > 5000|| ss < 600) {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("false");
                } else {
                    try {
                        out = resp.getWriter();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    out.print("ok");
                }
            }
        }
    }

 @RequestMapping(value = "/danguchun")
 public void danguchun(HttpServletRequest req,HttpServletResponse resp){

     String age=req.getParameter("age");
     if(age!=""&&!age.equals("")) {
         if(age.matches("^\\d+(\\.\\d+)?$")){
      //   System.out.println(age);
         double ss = Double.parseDouble(age);
         System.out.println(ss);
         if (ss > 16000 || ss < 3000) {
             try {
                 out = resp.getWriter();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             out.print("false");
         } else {
             try {
                System.out.println("===");
                 out = resp.getWriter();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             out.print("ok");
         }
    }
     }

 }

    @RequestMapping(value = "/show1")
    @ResponseBody
    public String show(xinnaoxueguan xueguan){
        xinnaoxueguan ss=new xinnaoxueguan();
        System.out.println(xueguan.getSex());
        System.out.println("ssss");
        System.out.println(xueguan.getSex());
        System.out.println("ssss");
        if (xueguan.getSex()=="1"||xueguan.getSex().equals("1")){
            ss=nan(xueguan);
            if(null != ss){
                return "您未来十年患有心脑血管疾病的概率是："+ss.getGailv();
            }

            else return "数据异常请联系管理员！！";
        }
        if (xueguan.getSex()=="0"||xueguan.getSex().equals("0")){
            ss=nv(xueguan);
            if(null != ss){
                return "您未来十年患有心脑血管疾病的概率是："+ss.getGailv();
            }

            else return "数据异常请联系管理员！！";
        }
        return null;
    }

    private xinnaoxueguan nv(xinnaoxueguan xueguan) {
        String age=xueguan.getAge();
        String tangniaobing=xueguan.getTangniaobing();
        String xiyan = xueguan.getXiyan();
        String hdl = xueguan.getHdl();
        String danguchun = xueguan.getDanguchun();
        String jiazu = xueguan.getJiazu();
        String quyu = xueguan.getQuyu();
        String weizhiliao = xueguan.getWeizhiliao();
        String zhiliaohou = xueguan.getZhiliaohou();
        String huanjin = xueguan.getHuanjin();
        String yaowei = xueguan.getYaowei();
        //  double a=0;
        //   double b=0;
        //   double c=0;
        double x = baoliu((double) Math.log(baoliu(age)) * 24.87);
        double a = baoliu((double) Math.log(baoliu(zhiliaohou)) * 20.71);
        double b = baoliu((double) Math.log(baoliu(weizhiliao))* 19.98);
        double c = baoliu((double) Math.log(baoliu(danguchun)) * 0.06);
        double d = baoliu((double) Math.log(baoliu(hdl)) * 0.22);
        double e = baoliu((double) Math.log(baoliu(yaowei)) * 1.48);
        double f =baoliu(Integer.parseInt(xiyan) * 0.49);
        double j =baoliu(Integer.parseInt(tangniaobing) * 0.57);
        double h =baoliu(Integer.parseInt(quyu) * 0.54);
     //   double chen=Integer.parseInt(huanjin) * 0.16;
    //    double i =Integer.parseInt(jiazu) * 6.22;

        double g =baoliu((double) Math.log(baoliu(age)) * 4.53 * (double) Math.log(baoliu(zhiliaohou)));
        double l =baoliu((double) Math.log(baoliu(age)) * (double) Math.log(baoliu(weizhiliao)) *4.36);
    //    double m =0.94* (double) Math.log(Double.parseDouble(age)) *Integer.parseInt(xiyan);
    //    double n =1.53 * (double) Math.log(Double.parseDouble(age))* Integer.parseInt(jiazu)-140.68;
        double o =x+a+b+c-d+e+f+j+h-g-l-117.26;
        System.out.println("--x:"+x+" a :"+a+"b:"+b+"c:"+c+"d:"+d+"e;"+e+"f:"+f+"j"+j+"h:"+h);
        System.out.println(o);
        double ss=baoliu(Math.pow(2.71828,o));
        double zz=baoliu(1-Math.pow(0.99,ss));
        DecimalFormat df = new DecimalFormat("0.00000%");
        String r = df.format(zz);
        System.out.println(r);

        xueguan.setGailv(r);
        xinnaoxueguan xinnaoxueguan = userService.save(xueguan);
        return  xinnaoxueguan;

    }

    private xinnaoxueguan nan(xinnaoxueguan xueguan) {
        System.out.println("---------------进入nan");
        String age=xueguan.getAge();
        String tangniaobing=xueguan.getTangniaobing();
        String xiyan = xueguan.getXiyan();
        String hdl = xueguan.getHdl();
        String danguchun = xueguan.getDanguchun();
        String jiazu = xueguan.getJiazu();
        String quyu = xueguan.getQuyu();
        String weizhiliao = xueguan.getWeizhiliao();
        String zhiliaohou = xueguan.getZhiliaohou();
        String huanjin = xueguan.getHuanjin();
        String yaowei = xueguan.getYaowei();
        //  double a=0;
        //   double b=0;
        //   double c=0;
        double x = baoliu((double) Math.log(baoliu(age)) * 31.97);
        double a =  baoliu((double) Math.log(baoliu(zhiliaohou)) * 27.39);
        double b =  baoliu((double) Math.log(baoliu(weizhiliao))* 26.15);
        double c =  baoliu((double) Math.log(baoliu(danguchun)) * 0.62);
        double d =  baoliu((double) Math.log(baoliu(hdl)) * 0.69);
        double e =  baoliu((double) Math.log(baoliu(yaowei)) * 0.71);
        double f = baoliu(Integer.parseInt(xiyan) * 3.96);
        double j = baoliu(Integer.parseInt(tangniaobing) * 0.36);
        double h = baoliu(Integer.parseInt(quyu) * 0.48);
        double chen= baoliu(Integer.parseInt(huanjin) * 0.16);
        double i = baoliu(Integer.parseInt(jiazu) * 6.22);

        double g = baoliu((double) Math.log(baoliu(age)) * 6.02 * (double) Math.log(baoliu(zhiliaohou)));
        double l = baoliu((double) Math.log(baoliu(age)) * (double) Math.log(baoliu(weizhiliao)) *5.73);
        double m = baoliu(0.94* (double) Math.log(baoliu(age)) *Integer.parseInt(xiyan));
        double n = baoliu(1.53 * (double) Math.log(baoliu(age))* Integer.parseInt(jiazu));
        double o =x + a + b + c  ;
        System.out.println("o   :--->"+o);
       // o=o- d- e+ f+ j+ h;
        System.out.println("o   :--->"+o);
        o=o-d;
        System.out.println("o   :--->"+o);
        o=o-e;
        System.out.println("o   :--->"+o);
        o=o+f;
        System.out.println("o   :--->"+o);
        o=o+j;
        System.out.println("o   :--->"+o);
        o=o+h;
//                o=o-
//                o=o-
//                o=o-
        System.out.println("o   :--->"+o);
        o=o- chen + i ;
        System.out.println("o   :--->"+o);
        o=o-g;
    //    o=o-g -l- m- n-140.68;
        o=o-l;
        o=o-m;
        o=o-n;
        System.out.println("o   :--->"+o);
        o=baoliu(o-140.68);
        System.out.println("o   :--->"+o);
        System.out.println("--x:"+x+" a :"+a+"b:"+b+"c:"+c+"d:"+d+"e;"+e+"f:"+f+"j"+j+"h:"+h+"chen"+chen+"i:"+i);
        System.out.println("   g： "+g+"l : "+l);
        System.out.println(o);
        double test=Math.pow(2,3);
        System.out.println("test------>"+test);
        double ss=baoliu(Math.pow(2.71,o));
        System.out.println("ss-->"+ss);
        double zz=baoliu(Math.pow(0.97,ss)) ;
        zz=baoliu(1-zz);
        System.out.println("zz-->"+zz);
        DecimalFormat df = new DecimalFormat("0.00000%");
        String r = df.format(zz);
        System.out.println(r);

        xueguan.setGailv(r);
        xinnaoxueguan xinnaoxueguan = userService.save(xueguan);
        return  xinnaoxueguan;

    }
    public double baoliu(String ss){
        double  sss=Double.parseDouble(ss);
        DecimalFormat df = new DecimalFormat("#.00");
        double zz=0;
        zz=Double.parseDouble(df.format(sss));
        return  zz;
    }
    public double baoliu(double ss){
        DecimalFormat df = new DecimalFormat("#.00");
        double zz=0;
        zz=Double.parseDouble(df.format(ss));
        return  zz;
    }

}

