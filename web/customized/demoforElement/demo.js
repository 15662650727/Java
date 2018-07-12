var abc = "123";
window.onload = function () {
    new Vue().$mount('#app');
    var Main = {
        data() {
            return {
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }]
            }
        },
        methods: {
            formatter(row, column) {
                return row.address;
            }
        }
    }
    var Ctor = Vue.extend(Main);
    new Ctor().$mount('#list');
    //如果不加window.onload,因为dom树为加在完成,此方法为的就是加载玩dom树后绑定元素,保证能保定上
    this.abc = "234";
    vm1.setForm();
}


var vm1 = new Vue({
    el:'#dp',
    data: {
        lhpRoad: {
            id: 0,
            roadName:"",
        }
    },
    mounted: function(){
        this.$options.methods.setForm();
    },
    methods : {
        setForm: function() {
            alert(abc);
        }
    }
});
//
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
