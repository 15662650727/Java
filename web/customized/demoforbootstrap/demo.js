$(function () {             //等价$(document).ready(function(){});  $().ready(function(){});
    console.log(999);
});

window.onload = function () {                             //如果不加window.onload,因为dom树为加在完成,此方法为的就是加载玩dom树后绑定元素,保证能保定上
}







































































/*
浏览器加载页面的顺序：

1、 解析HTML结构

2、 加载外部脚本和样式表文件

3、 解析并执行脚本代码

4、 构造HTML
DOM模型 == ready()

5、 加载图片等组件

6、 页面加载完毕 == onload()

ready事件是在DOM模型构造完毕时触发

load事件是在页面加载完毕后触发*/
