import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    user: {
      username: ''
    }
  },
  mutations: {
    updateUser (state, username) {
      state.user.username = username
    }
  },
  actions: {

  }
})
