import Vue from 'vue';
import Vuex from 'vuex';

import { rootstate } from './state';
// import * as actions from './actions';
import * as mutations from './mutations';
import * as getters from './getters';

import viewaction from './modules/view-action'
import authresource from './modules/auth-resource'

const state = {
    ...rootstate
};
// 路由热启动已经修复
Vue.use(Vuex);

const store = new Vuex.Store({
    state,
    // actions,
    mutations,
    getters,
    modules: {
        viewaction,
        authresource
    },
});

export default store;
