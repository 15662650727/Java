$(function () {
    console.log(999);
});


window.onload = function () {                             //如果不加window.onload,因为dom树为加在完成,此方法为的就是加载玩dom树后绑定元素,保证能保定上
    var button1 = document.getElementById("button1");     //一般采用juery的 ready函数.因其不用等到整个页面资源加在完成,解析玩dom树后即可
    console.log(document);
    console.log(button1);
}