<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link href="http://unpkg.com/element-ui/lib/theme-chalk/index.css" rel="stylesheet">
    <style>
        html {
            height: 100%;
            overflow: hidden;
        }
        body{
            height: 100%;
            overflow: hidden;
            margin: 0px;
        }
        .el-header, .el-footer {
            background-color: #B3C0D1;
            color: #333;
            text-align: center;
            line-height: 60px;
        }
        .el-header {
            position: absolute;
            top: 0px;
            left: 0px;
            width:100%;
            height:60px;
        }
        .el-footer {
            position: absolute;
            bottom: 0px;
            left: 200px;
            right: 0px;
        }
        .el-aside {
            position: absolute;
            top: 60px;
            bottom: 0px;
            background-color: #D3DCE6;
            color: #333;
            text-align: center;
            line-height: 500px;
        }

        .el-main {
            position: absolute;
            top: 60px;
            left: 200px;
            bottom: 20px;
            right: 0px;
            background-color: #E9EEF3;
            color: #333;
            margin: 0px;
            padding: 0px;
        }

        body > .el-container {
            margin-bottom: 40px;
        }

        .el-container:nth-child(5) .el-aside,
        .el-container:nth-child(6) .el-aside {
            line-height: 260px;
        }

        .el-container:nth-child(7) .el-aside {
            line-height: 320px;
        }
        body > div{
            position: relative;
            height: 100%;
            max-height: 100%;
            overflow: hidden;
        }
    </style>
    <script src="http://unpkg.com/vue/dist/vue.js"></script>
    <script src="http://unpkg.com/element-ui/lib/index.js"></script>
    <title>Element 101 Template</title>
    <script src="demo.js"></script>
</head>
<body>

<div id="app">


    <el-container>
        <el-header>Header</el-header>
        <el-container>
            <el-aside width="200px">Aside</el-aside>
            <el-container>
                <el-main>
                    <div id="list">
                        <template>
                            <el-table :data="tableData" style="width: 100%" :default-sort="{prop: 'date', order: 'descending'}">
                                <el-table-column prop="date" label="日期" sortable width="180">
                                </el-table-column>
                                <el-table-column prop="name" label="姓名" sortable width="180">
                                </el-table-column>
                                <el-table-column prop="address" label="地址" :formatter="formatter">
                                </el-table-column>
                            </el-table>
                        </template>
                    </div>
                </el-main>
                <el-footer>Footer</el-footer>
            </el-container>
        </el-container>
    </el-container>

</div>
</body>
</html>
