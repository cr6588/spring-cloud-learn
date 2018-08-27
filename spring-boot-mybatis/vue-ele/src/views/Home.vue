<template>
<el-container>
    <el-header>
      <Header></Header>
    </el-header>
    <el-container>
        <el-aside width="201px">
          <Aside></Aside>
        </el-aside>
        <el-container>
            <el-main>
                <router-view name="helper"/>
            </el-main>
            <el-footer>
                Copyright © 2016 - 2018 All Rights Reserved | 版权所有：cr6588 &nbsp;&nbsp;&nbsp;&nbsp;<a href="http://www.miibeian.gov.cn" style="color:#858894;" target="_blank">蜀ICP备XXXXXX号</a></div>
            </el-footer>
        </el-container>
    </el-container>
</el-container>
</template>

<style>
.el-header {
  padding: 0
}

.el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
}

.el-aside {
    background-color: #D3DCE6;
    color: #333;
    /* text-align: center; */
    line-height: 200px;
}

.el-main {
    background-color: #E9EEF3;
    color: #333;
    /* text-align: center; */
    /* line-height: 160px; */
}

body>.el-container {
    margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
    line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
    line-height: 320px;
}
</style>
<script>
import Aside from '@/components/aside.vue'
import Header from '@/components/header.vue'
export default {
  name: 'loginRegis',
  components: {
    Aside,
    Header
  },
  data : function () {
      return {}
  }
}
</script>