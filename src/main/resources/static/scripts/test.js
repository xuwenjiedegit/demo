function sub(){
    var age= $("#age").val();
    var zhiliaohou2 = $("#dangqian").val();
//    var weizhiliao = $("#weizhiliao").val();
    var danguchun = $("#danguchun").val();
    var hdl = $("#hdl").val();
    var yaowei = $("#yaowei").val();
    var xiyanFlag=$("input[name='xiyanFlag']:checked").val();
    var tangFlag=$("input[name='tangFlag']:checked").val();
    var quyuFlag=$("input[name='quyuFlag']:checked").val();
    var huanjinFlag=$("input[name='huanjinFlag']:checked").val();
    var jiazuFlag=$("input[name='jiazuFlag']:checked").val();
    var sex=$("input[name='sex1']:checked").val();
    var fuyong=$("input[name='fuyong1']:checked").val();
    // var xueguan=new xinnaoxueguan(age,zhiliaohou,weizhiliao,danguchun,hdl,yaowei,xiyanFlag,tangFlag,quyuFlag,huanjinFlag,jiazuFlag);
    fm.xiyan.value=xiyanFlag;
    fm.huanjin.value=huanjinFlag;
    fm.tangniaobing.value=tangFlag;
    fm.quyu.value=quyuFlag;
    fm.jiazu.value=jiazuFlag;
    fm.sex.value=sex;
    alert(fuyong);
    if(fuyong==0){
        fm.weizhiliao.value=zhiliaohou2;
        fm.zhiliaohou.value=1;

    }
    if(fuyong==1){
        fm.weizhiliao.value=1;
        fm.zhiliaohou.value=zhiliaohou2;

    }
    if(age==""||zhiliaohou2==""||danguchun==""||hdl==""||yaowei==""||xiyanFlag==""||tangFlag==""||quyuFlag==""||huanjinFlag==""||jiazuFlag==""||sex==""||fuyong=="")
    {
        alert("您有数据没有填写完整，请检查填写补全后在提交");
    }

    fm.submit();
}

function yizou(){

   var age= $("#age").val();
    $.ajax({
        "url":"/user/panduanage",
        "data":{"age":age},
        "type":"post",
        "datatype":"josn",
        "success":function (obj) {
            if(obj=="ok"){
                $("#agess").html("");
              document.getElementById("agess").style.display="none";
            }else
            {
                document.getElementById("agess").style.display="";
                $("#agess").html("输入格式不正确");
            }
        }
     })
 }

// function zhiliaoyihou(){
//     var age = $("#zhiliaohou").val();
//     $.ajax({
//         "url":"/user/panduanzhiliaohou",
//         "data":{"age":age},
//         "type":"post",
//         "datatype":"josn",
//         "success":function (obj) {
//             if(obj=="ok"){
//                 $("#zhiliaohouss").html("");
//                 document.getElementById("zhiliaohouss").style.display="none";
//             }else
//             {
//                 document.getElementById("zhiliaohouss").style.display="";
//                 $("#zhiliaohouss").html("输入格式不正确");
//             }
//         }
//     })
// }


function dangqiande() {
    var age = $("#dangqian").val();
    $.ajax({
        "url":"/user/panduanzhiliaohou",
        "data":{"age":age},
        "type":"post",
        "datatype":"josn",
        "success":function (obj) {
            if(obj=="ok"){
                $("#dangqianss").html("");
                document.getElementById("dangqianss").style.display="none";
            }else
            {
                document.getElementById("dangqianss").style.display="";
                $("#dangqianss").html("输入格式不正确");
            }
        }
    })

}


function zongdanguchun() {
    var age = $("#danguchun").val();
    $.ajax({
        "url":"/user/danguchun",
        "data":{"age":age},
        "type":"post",
        "datatype":"josn",
        "success":function (obj) {
            if(obj=="ok"){
                $("#danguchunss").html("");
                document.getElementById("danguchunss").style.display="none";
            }else
            {
                document.getElementById("danguchunss").style.display="";
                $("#danguchunss").html("输入格式不正确");
            }
        }
    })

}

function zonghdl() {
    var age = $("#hdl").val();
    $.ajax({
        "url":"/user/hdl",
        "data":{"age":age},
        "type":"post",
        "datatype":"josn",
        "success":function (obj) {
            if(obj=="ok"){
                $("#hdlss").html("");
                document.getElementById("hdlss").style.display="none";
            }else
            {
                document.getElementById("hdlss").style.display="";
                $("#hdlss").html("输入格式不正确");
            }
        }
    })

}


function zongyaowei() {
    var age = $("#yaowei").val();
    $.ajax({
        "url":"/user/panduanyaowei",
        "data":{"age":age},
        "type":"post",
        "datatype":"josn",
        "success":function (obj) {
            if(obj=="ok"){
                $("#yaoweiss").html("");
                document.getElementById("yaoweiss").style.display="none";
            }else
            {
                document.getElementById("yaoweiss").style.display="";
                $("#yaoweiss").html("输入格式不正确");
            }
        }
    })

}

// function quchu() {
//     alert("s");
//     var sex=$("input[name='sex']:checked").val();
//     if(sex==0){
//         document.getElementById("huanjin1").style.display="none";
//         document.getElementById("jiazu1").style.display="none";
//     }
//
//
// }

$(document).ready(function() {
    $('input[type=radio][name=sex1]').change(function() {
        if (this.value == '1') {
            document.getElementById("huanjin2").style.display="";
            document.getElementById("jiazu2").style.display="";
        }
        else if (this.value == '0') {
            document.getElementById("huanjin2").style.display="none";
            document.getElementById("jiazu2").style.display="none";
        }
    });
});
