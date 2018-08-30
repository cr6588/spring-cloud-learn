import Vue from 'vue'
import App from './App.vue'
import './plugins/element.js'
import axios from 'axios'
import router from './router'
import store from './store'

Vue.config.productionTip = false
//axios.defaults.baseURL = 'https://localhost:8080'
Vue.prototype.$axios = axios

var myApp = new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

