import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    user: {
      username: ''
    },
    headerMenu: ''
  },
  getters: {
    userDb: state => {
      var v = state.user.username
      if(v) {
        return state.user
      }
      v = sessionStorage.getItem("username")
      if(v) {
        state.user.username = v
      }
      return state.user
    },
    headerMenuType: state => {
      var keyArray =  state.headerMenu.split("/")
      for(var i in keyArray) {
          var menuType = keyArray[i]
          if(menuType) {
              return menuType
          }
          
      }
    }
  },
  mutations: {
    updateUser (state, v) {
      state.user.username = v
      sessionStorage.setItem("username", v)
    },
    updateHeaderMenu(state, v) {
      state.headerMenu = v
    }
  },
  actions: {

  }
})
