<template>
<div>
    <!-- <el-radio-group v-model="isCollapse" style="margin-bottom: 20px;">
        <el-radio-button :label="false">展开</el-radio-button>
        <el-radio-button :label="true">收起</el-radio-button>
    </el-radio-group> -->
    <el-menu router :default-active="headerMenu" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse" :unique-opened="uniqueOpened">
        <!-- background-color="#30343f" text-color="#919cbd" active-text-color="#fff" -->

        <el-submenu v-show="headerMenuType === 'user'" index="1">
            <template slot="title">
                <i class="el-icon-location"></i>
                <span slot="title">用户</span>
            </template>
            <el-menu-item-group>
                <el-menu-item index="/user/users">用户列表</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group>
                <el-menu-item index="/user/roles">角色列表</el-menu-item>
            </el-menu-item-group>
        </el-submenu>
        <div v-show="headerMenuType === 'logistics'">
            <el-submenu index="2">
                <template slot="title">
                    <i class="el-icon-location"></i>
                    <span slot="title">物流列表</span>
                </template>
                <el-menu-item-group>
                    <!-- <span slot="title">系统认可物流</span> -->
                    <el-menu-item index="/logistics/sysLogisticsList">系统认可物流</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group>
                    <el-menu-item index="2-3">海外仓物流</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group>
                    <el-menu-item index="2-3">自定义物流</el-menu-item>
                </el-menu-item-group>
            </el-submenu>
            <el-submenu index="3">
                <template slot="title">
                    <i class="el-icon-location"></i>
                    <span slot="title">运单号管理</span>
                </template>
                <el-menu-item-group>
                    <!-- <span slot="title">分组一</span> -->
                    <el-menu-item index="3-1">自定义物流单号</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group>
                    <el-menu-item index="3-3">国内快递单号</el-menu-item>
                </el-menu-item-group>
            </el-submenu>
            <el-submenu index="4">
                <template slot="title">
                    <i class="el-icon-location"></i>
                    <span slot="title">基础设定</span>
                </template>
                <el-menu-item-group>
                    <!-- <span slot="title">分组一</span> -->
                    <el-menu-item index="2-1">发货/揽货地址</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group>
                    <el-menu-item index="2-3">物流匹配规则</el-menu-item>
                </el-menu-item-group>
                <el-menu-item-group>
                    <el-menu-item index="2-3">自定义运费</el-menu-item>
                </el-menu-item-group>
            </el-submenu>
        </div>
    </el-menu>
</div>
</template>

<style>
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 670px;
  }
  .el-menu-item-group__title {
      padding: 0;
  }
</style>
<script>
export default {
    name: 'my-aside',
    data() {
      return {
        isCollapse: false,
        uniqueOpened: true
      };
    },
    methods: {
      handleOpen(key, keyPath) {
      },
      handleClose(key, keyPath) {
      }
    },
    computed: {
        headerMenu() {
            return this.$store.state.headerMenu
        },
        headerMenuType() {
            return this.$store.getters.headerMenuType
        }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
