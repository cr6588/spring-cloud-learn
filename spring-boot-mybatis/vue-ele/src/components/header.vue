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
    <el-col :span="18">
        <div class="grid-content bg-purple-light">
            <!-- 加入router启用vue-router导航 -->
            <el-menu router :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
                <!-- background-color="#478de4" text-color="#fff" active-text-color="#ffd04b" -->
                <el-menu-item index="1">
                    首页
                </el-menu-item>
                <el-menu-item index="/user/users">用户</el-menu-item>
                <el-menu-item index="4">物流</el-menu-item>
            </el-menu>
        </div>
    </el-col>
    <el-col :span="2">
        <div class="grid-content bg-purple-light header-center">
            <el-dropdown>
            <span class="el-dropdown-link">
                {{ user.username }}<i class="el-icon-arrow-down el-icon--right"></i>
            </span>
            <el-dropdown-menu slot="dropdown">
                <el-dropdown-item>注销</el-dropdown-item>
            </el-dropdown-menu>
            </el-dropdown>
            <!-- <el-dropdown>
                {{ user.username }}<i class="el-icon-setting" style="margin-right: 15px"></i>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>查看</el-dropdown-item>
                    <el-dropdown-item>新增</el-dropdown-item>
                    <el-dropdown-item>删除</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown> -->
            
        </div>
    </el-col>

</el-row>
</template>

<style>
.header-center *{
    line-height: 60px;
    vertical-align: middle;
    font-size: 14px;
    text-align: center;
    /* -webkit-box-direction: normal; */
}
.header-center ul {
    margin: 0px;
    padding: 0 0;
    list-style: none;
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
    },
    computed: {
        user () {
            return this.$store.state.user
        }
    }
}
</script>
