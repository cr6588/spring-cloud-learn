(function(e){function r(r){for(var n,a,i=r[0],u=r[1],l=r[2],c=0,p=[];c<i.length;c++)a=i[c],s[a]&&p.push(s[a][0]),s[a]=0;for(n in u)Object.prototype.hasOwnProperty.call(u,n)&&(e[n]=u[n]);f&&f(r);while(p.length)p.shift()();return o.push.apply(o,l||[]),t()}function t(){for(var e,r=0;r<o.length;r++){for(var t=o[r],n=!0,a=1;a<t.length;a++){var u=t[a];0!==s[u]&&(n=!1)}n&&(o.splice(r--,1),e=i(i.s=t[0]))}return e}var n={},s={app:0},o=[];function a(e){return i.p+"static/js/"+({about:"about"}[e]||e)+"."+{about:"f2dc9309"}[e]+".js"}function i(r){if(n[r])return n[r].exports;var t=n[r]={i:r,l:!1,exports:{}};return e[r].call(t.exports,t,t.exports,i),t.l=!0,t.exports}i.e=function(e){var r=[],t=s[e];if(0!==t)if(t)r.push(t[2]);else{var n=new Promise(function(r,n){t=s[e]=[r,n]});r.push(t[2]=n);var o,u=document.getElementsByTagName("head")[0],l=document.createElement("script");l.charset="utf-8",l.timeout=120,i.nc&&l.setAttribute("nonce",i.nc),l.src=a(e),o=function(r){l.onerror=l.onload=null,clearTimeout(c);var t=s[e];if(0!==t){if(t){var n=r&&("load"===r.type?"missing":r.type),o=r&&r.target&&r.target.src,a=new Error("Loading chunk "+e+" failed.\n("+n+": "+o+")");a.type=n,a.request=o,t[1](a)}s[e]=void 0}};var c=setTimeout(function(){o({type:"timeout",target:l})},12e4);l.onerror=l.onload=o,u.appendChild(l)}return Promise.all(r)},i.m=e,i.c=n,i.d=function(e,r,t){i.o(e,r)||Object.defineProperty(e,r,{enumerable:!0,get:t})},i.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},i.t=function(e,r){if(1&r&&(e=i(e)),8&r)return e;if(4&r&&"object"===typeof e&&e&&e.__esModule)return e;var t=Object.create(null);if(i.r(t),Object.defineProperty(t,"default",{enumerable:!0,value:e}),2&r&&"string"!=typeof e)for(var n in e)i.d(t,n,function(r){return e[r]}.bind(null,n));return t},i.n=function(e){var r=e&&e.__esModule?function(){return e["default"]}:function(){return e};return i.d(r,"a",r),r},i.o=function(e,r){return Object.prototype.hasOwnProperty.call(e,r)},i.p="/",i.oe=function(e){throw console.error(e),e};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],l=u.push.bind(u);u.push=r,u=u.slice();for(var c=0;c<u.length;c++)r(u[c]);var f=l;o.push([0,"chunk-vendors"]),t()})({0:function(e,r,t){e.exports=t("56d7")},"034f":function(e,r,t){"use strict";var n=t("c21b"),s=t.n(n);s.a},"23be":function(e,r,t){"use strict";var n=t("79a2"),s=t.n(n);r["default"]=s.a},"2e07":function(e,r,t){},"3dfd":function(e,r,t){"use strict";var n=t("7654"),s=t("23be"),o=(t("034f"),t("2877")),a=Object(o["a"])(s["default"],n["a"],n["b"],!1,null,null,null);a.options.__file="App.vue",r["default"]=a.exports},"56d7":function(e,r,t){"use strict";t.r(r);var n=t("2b0e"),s=t("3dfd"),o=t("5c96"),a=t.n(o);t("0fae");n["default"].use(a.a);var i=t("bc3a"),u=t.n(i),l=t("8c4f"),c=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{staticClass:"login-box",attrs:{id:"loginRegis"}},[t("Login",{directives:[{name:"show",rawName:"v-show",value:"login"===e.action,expression:"action === 'login'"}],on:{actionToRegis:function(r){e.action="regis"}}}),t("Regis",{directives:[{name:"show",rawName:"v-show",value:"regis"===e.action,expression:"action === 'regis'"}],on:{actionToLogin:function(r){e.action="login"}}})],1)},f=[],p=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",[t("div",[e._v("登录")]),t("el-form",{ref:"user",staticClass:"demo-ruleForm",attrs:{model:e.user,rules:e.rules,"label-width":"100px"}},[t("el-form-item",{attrs:{label:"用户名",prop:"username"}},[t("el-input",{attrs:{clearable:"","auto-complete":"off"},model:{value:e.user.username,callback:function(r){e.$set(e.user,"username",r)},expression:"user.username"}})],1),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{attrs:{type:"password",clearable:"","auto-complete":"off"},model:{value:e.user.password,callback:function(r){e.$set(e.user,"password",r)},expression:"user.password"}})],1),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:function(r){e.login("user")}}},[e._v("登录")]),t("el-button",{attrs:{type:"primary"},on:{click:function(r){e.$emit("actionToRegis")}}},[e._v("免费注册点这里")])],1)],1)],1)},m=[],d={name:"login",data:function(){return{user:{username:"",password:""},rules:{username:[{required:!0,message:"请输入用户名",trigger:"blur"},{min:6,max:16,message:"长度在6到16位",trigger:"blur"},{len:11,message:"长度11位",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:6,max:16,message:"长度在6到16位",trigger:"blur"}]}}},methods:{login:function(e){this.$refs[e].validate(e=>{if(!e)return!1;var r=this;this.$axios.post("/user/login",this.user).then(function(e){var t=e.data;0==t.code?(r.$message({message:"登录成功",type:"success"}),r.$router.push("about")):r.$message.error(t.msg)}).catch(e=>{console.log(e),r.$message.error("网络错误")})})}}},g=d,b=(t("d01b"),t("2877")),v=Object(b["a"])(g,p,m,!1,null,"31861727",null);v.options.__file="login.vue";var h=v.exports,w=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",[t("el-form",{ref:"user",staticClass:"demo-ruleForm",attrs:{model:e.user,rules:e.rules,"label-width":"100px"}},[t("el-form-item",[t("el-button",{attrs:{type:"primary",icon:"el-icon-back"},on:{click:function(r){e.$emit("actionToLogin")}}})],1),t("el-form-item",{attrs:{label:"用户名",prop:"username"}},[t("el-input",{attrs:{clearable:"","auto-complete":"off"},model:{value:e.user.username,callback:function(r){e.$set(e.user,"username",r)},expression:"user.username"}})],1),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{attrs:{type:"password",clearable:"","auto-complete":"off"},model:{value:e.user.password,callback:function(r){e.$set(e.user,"password",r)},expression:"user.password"}})],1),t("el-form-item",{attrs:{label:"重复密码",prop:"repeatPassword"}},[t("el-input",{attrs:{type:"password",clearable:"","auto-complete":"off"},model:{value:e.user.repeatPassword,callback:function(r){e.$set(e.user,"repeatPassword",r)},expression:"user.repeatPassword"}})],1),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:function(r){e.regis("user")}}},[e._v("注册")]),t("el-button",{on:{click:function(r){e.resetForm("user")}}},[e._v("重置")])],1)],1)],1)},y=[],x={name:"regis",data:function(){var e=(e,r,t)=>{r!==this.user.password?t(new Error("两次输入密码不一致!")):t()};return{user:{username:"",password:"",repeatPassword:""},rules:{username:[{required:!0,message:"请输入用户名",trigger:"blur"},{min:6,max:16,message:"长度在6到16位",trigger:"blur"},{len:11,message:"长度11位",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:6,max:16,message:"长度在6到16位",trigger:"blur"}],repeatPassword:[{required:!0,message:"请输入重复密码",trigger:"blur"},{min:6,max:16,message:"长度在6到16位",trigger:"blur"},{validator:e,trigger:"blur"}]}}},methods:{regis:function(e){this.$refs[e].validate(e=>{if(!e)return!1;var r=this;this.$axios.post("/user/regis",this.user).then(function(e){var t=e.data;0==t.code?r.$message({message:"注册成功",type:"success"}):r.$message.error(t.msg)}).catch(function(e){r.$message.error("网络错误")})})},resetForm(e){this.$refs[e].resetFields()}}},_=x,$=(t("6477"),Object(b["a"])(_,w,y,!1,null,"107ec534",null));$.options.__file="regis.vue";var k=$.exports,j={name:"loginRegis",components:{Login:h,Regis:k},data:()=>{return{action:"login"}}},P=j,O=(t("5746"),Object(b["a"])(P,c,f,!1,null,null,null));O.options.__file="LoginRegis.vue";var T=O.exports;n["default"].use(l["a"]);var E=new l["a"]({mode:"history",base:"/",routes:[{path:"/",name:"loginRegis",component:T},{path:"/about",name:"about",component:()=>t.e("about").then(t.bind(null,"f820"))}]}),R=t("2f62");n["default"].use(R["a"]);var q=new R["a"].Store({state:{},mutations:{},actions:{}});n["default"].config.productionTip=!1,n["default"].prototype.$axios=u.a,new n["default"]({router:E,store:q,render:e=>e(s["default"])}).$mount("#app")},5746:function(e,r,t){"use strict";var n=t("2e07"),s=t.n(n);s.a},6477:function(e,r,t){"use strict";var n=t("ac60"),s=t.n(n);s.a},7654:function(e,r,t){"use strict";var n=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{attrs:{id:"app"}},[t("router-view")],1)},s=[];t.d(r,"a",function(){return n}),t.d(r,"b",function(){return s})},"79a2":function(e,r){},ac60:function(e,r,t){},c21b:function(e,r,t){},d01b:function(e,r,t){"use strict";var n=t("d140"),s=t.n(n);s.a},d140:function(e,r,t){}});
//# sourceMappingURL=app.3ce589cd.js.map