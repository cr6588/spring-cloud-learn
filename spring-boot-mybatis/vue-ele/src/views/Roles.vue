<template>
<el-table :data="tableData">
    <el-table-column prop="id" label="id">
    </el-table-column>
    <el-table-column prop="name" label="名称">
    </el-table-column>
    <el-table-column prop="status" label="状态">
    </el-table-column>
    <el-table-column prop="permission" label="权限集">
    </el-table-column>
    <el-table-column prop="deleted" label="是否已删除">
    </el-table-column>
</el-table>
</template>

<style>

</style>

<script>
export default {
    data() {
        var vue = this;
        this.$axios.post('/user/getRoles')
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
