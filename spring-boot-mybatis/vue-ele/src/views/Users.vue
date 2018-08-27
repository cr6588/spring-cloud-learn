<template>
<el-table :data="tableData">
    <el-table-column prop="id" label="id">
    </el-table-column>
    <el-table-column prop="username" label="用户名">
    </el-table-column>
    <el-table-column prop="password" label="密码">
    </el-table-column>
</el-table>
</template>

<style>

</style>

<script>
export default {
    data() {
        var vue = this;
        this.$axios.post('/user/getUsers')
            .then(function (res) {
                var res = res.data
                if (res.code == 0) {
                    //等网络请求完时，页面已经先返回了tableData，
                    vue.tableData = res.body
                } else {
                    vue.$message.error(res.msg);
                }
            })
            .catch((error) => {
                console.log(error)
                vue.$message.error("网络错误")
            });
        return {
            tableData: []
        }
    }
};
</script>
