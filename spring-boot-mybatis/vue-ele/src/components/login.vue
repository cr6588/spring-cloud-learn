<template>
<div>
    <el-form :model="user" :rules="rules" ref="user" label-width="100px" class="demo-ruleForm">
        <el-form-item label="用户名" prop="username">
            <el-input clearable v-model="user.username" auto-complete="off"> </el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
            <el-input type="password" clearable v-model="user.password" auto-complete="off"> </el-input>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="login('user')">登录</el-button>
            <el-button type="primary" v-on:click="$emit('actionToRegis')">免费注册点这里</el-button>
        </el-form-item>
    </el-form>
</div>
</template>
<script>
export default {
  name: 'login',
  data: function () {
        return {
            user: {
                username: "",
                password: "",
            },
            rules: {
                username: [{
                        required: true,
                        message: '请输入用户名',
                        trigger: 'blur'
                    },{
                        min: 6,
                        max: 16,
                        message: '长度在6到16位',
                        trigger: 'blur'
                    }
                ],
                password: [{
                    required: true,
                    message: '请输入密码',
                    trigger: 'blur'
                },{
                    min: 6,
                    max: 16,
                    message: '长度在6到16位',
                    trigger: 'blur'
                }]
            },
        };
    },
  methods: {
      login: function (formName) {
        this.$refs[formName].validate((valid) => {
            if (!valid) {
                return false;
            }
            var vue = this;
            var username = this.user.username
            this.$axios.post('/user/login', this.user)
                .then(function (res) {
                    var data = res.data
                    if(data.code == 0) {
                        vue.$message({
                            message: "登录成功",
                            type: 'success'
                        })
                        vue.$store.commit('updateUser', username)
                        vue.$store.commit('updateHeaderMenu', '')
                        vue.$router.push('/home/main')
                    } else {
                        vue.$message.error(data.msg);
                    }
                })
                .catch( (error) => {
                    console.log(error)
                    vue.$message.error("网络错误")
                });
        });
      }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
