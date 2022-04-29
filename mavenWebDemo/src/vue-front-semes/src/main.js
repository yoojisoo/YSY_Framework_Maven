import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import axios from 'axios'
import vuex from 'vuex'

loadFonts()

axios.defaults.baseURL = "http://localhost:8080";
const app = createApp(App);
app.config.globalProperties.axios = axios;
app.use(router).use(vuetify).use(vuex).mount("#app");

