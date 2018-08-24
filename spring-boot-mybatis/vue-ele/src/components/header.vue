<template>
<el-row>
    <el-col :span="4">
        <div class="grid-content bg-purple header-center">
            <ul>
                <li>
                    <img alt="Vue logo" src="@/assets/logo.png" style="width: 30px"> vue-element
                </li>
            </ul>
        </div>
    </el-col>
    <el-col :span="16">
        <div class="grid-content bg-purple-light">
            <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
                <!-- background-color="#478de4" text-color="#fff" active-text-color="#ffd04b" -->
                <el-menu-item index="1">
                    <img alt="Vue logo" src="@/assets/logo.png" style="width: 30px">
                    首页
                </el-menu-item>
                <el-submenu index="2">
                    <template slot="title">用户</template>
                    <el-menu-item index="2-1">用户列表</el-menu-item>
                </el-submenu>
            </el-menu>
        </div>
    </el-col>
    <el-col :span="4">
        <div class="grid-content bg-purple-light header-center">
            <el-dropdown>
                <i class="el-icon-setting" style="margin-right: 15px"></i>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>查看</el-dropdown-item>
                    <el-dropdown-item>新增</el-dropdown-item>
                    <el-dropdown-item>删除</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
            <span>王小虎</span></div>
    </el-col>

</el-row>
</template>

<style>
.header-center *{
    height: 60px;
    line-height: 60px;
    vertical-align: middle;
    font-size: 14px;
        -webkit-box-direction: normal;
}
/* .header-center ul {
    margin: 0px
} */
</style>

<script>
export default {
    name: "my-header",
    data() {
        return {
            activeIndex: '1'
        };
    },
    methods: {
        handleSelect(key, keyPath) {
            console.log(key, keyPath);
        }
    }
}
</script>
