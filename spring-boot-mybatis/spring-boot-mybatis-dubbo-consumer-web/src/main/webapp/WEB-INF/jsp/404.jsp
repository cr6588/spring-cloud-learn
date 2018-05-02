<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>404错误页面</title>
        <style>
            body{ background: url(images/404/bg6a.png) repeat-x #f6faff; margin:0; padding:0; font: 12px/1.6 "Segoe UI",Tahoma,Arial;word-wrap: break-word;}
            .mid{ width:950px; margin:0 auto}
            .logo404{height:180px; background:url(images/404/404.png) no-repeat center center; margin-top:100px}
            .list404{ margin:50px 0}
            .fooder404{ margin:60px auto;font-family:"微软雅黑";} 
            .fooder404 ul{margin:0 auto;list-style:none;padding:0; border-top:1px solid #d5d8dc; padding-top:10px;text-align:center}
            .fooder404 ul li{ list-style:none; margin:0; padding:0; float:left;}
            .fooder404 ul li a{ margin:0 10px; color:#333333; text-decoration:none; font-size:14px;}
            .fooder404 ul li a:hover{ text-decoration:underline;color:#ff0000}
            .list404 p{ color:#666; font-size:14px; font-family:"微软雅黑";text-decoration:none}
            .list404 p b.size20{font-size:20px;}
        </style>
    </head>
    <body>
        <div class="mid">
            <div class="logo404"></div>
            <div class="list404">
                <p style="font-size:18px; color:#0964a3;">您打开的页面不存在......</p>
                <p>HTTP错误404 ：您正在访问的页面可能<font color="red"><b>已经删除、更名或暂时不可用</b></font>.</p>
                <p>如果你是从本站链接到达此页，请与管理员联系，通知他们链接有误，以便及时更正。</p>
                <p>如果你是从其他网站到达此页，可以点击返回上一页，输入相关的关键字以便找到您所要的软件或相关内容。</p>
                <p>您现在可以<a href="javascript:history.go(-1);"><b class="size20">返回上一页</b></a></p>
            </div>
        </div>
    </body>
</html>