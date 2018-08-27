import Vue from 'vue'
import Router from 'vue-router'
import LoginRegis from './views/LoginRegis.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'loginRegis',
      component: LoginRegis
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/home',
      name: 'home',
      component: () => import('./views/Home.vue'),
      children: [{
        //path: 'users', 路径为/home/users
        path: '/user/users',
        name: 'users',
        components: {
          helper: () => import('./views/Users.vue')
        }
      }, {
        path: '/user/roles',
        name: 'roles',
        components: {
          helper: () => import('./views/Roles.vue')
        }
      }]
    }
  ]
})
