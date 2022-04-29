import HomeView from '../views/HomeView.vue'
import FavoriteView from '../views/FavoriteView.vue'
import LayoutView from '../views/LayoutView.vue'
import TransferView from '../views/TransferView.vue'
import DeviceView from '../views/DeviceView.vue'
import FunctionView from '../views/FunctionView.vue'
import HistoryView from '../views/HistoryView.vue'
import LogView from '../views/LogView.vue'
import SystemView from '../views/SystemView.vue'

const menus = [
    {
        path: '/',
        name: 'home',
        component: HomeView,
        icon: 'mdi-home',
    },
    {
        path: '/favorite',
        name: 'favorite',
        component: FavoriteView,
        icon: 'mdi-home',
    },
    {
        path: '/layout',
        name: 'layout',
        component: LayoutView,
        icon: 'mdi-home',
    },
    {
        path: '/transfer',
        name: 'transfer',
        component: TransferView,
        icon: 'mdi-home',
    },
    {
        path: '/device',
        name: 'device',
        component: DeviceView,
        icon: 'mdi-home',
    },
    {
        path: '/function',
        name: 'function',
        component: FunctionView,
        icon: 'mdi-home',
    },
    {
        path: '/history',
        name: 'history',
        component: HistoryView,
        icon: 'mdi-home',
    },
    {
        path: '/log',
        name: 'log',
        component: LogView,
        icon: 'mdi-home',
    },
    {
        path: '/system',
        name: 'system',
        component: SystemView,
        icon: 'mdi-home',
    },
]

export default menus