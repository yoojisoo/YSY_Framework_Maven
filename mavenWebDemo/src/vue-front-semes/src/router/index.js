import { createRouter, createWebHistory } from 'vue-router'
import v_menus from '@/assets/vMenus.js'

const routes = v_menus

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router