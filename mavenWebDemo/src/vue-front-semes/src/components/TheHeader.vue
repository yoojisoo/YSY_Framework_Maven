<template>
  <header>
    <v-app-bar color="indigo darken-1">
      <span class="hidden-sm-and-up">
        <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
      </span>
      <v-app-bar-title>
        <v-img class="hidden-xs" max-width="100" src='@/assets/img/semes.png'/>
        <span class="hidden-sm-and-up" > SEMES </span>
      </v-app-bar-title>
      <v-tabs class="hidden-xs" background-color="indigo darken-1">
        <v-tab
          v-for="item in sideMenu"
          :key="item"
          :to="item.path"
        >
          {{ item.name }}
        </v-tab>
      </v-tabs>
      <v-spacer/>
      <v-spacer/>
      <v-spacer/>
      <v-spacer/>
      <v-spacer/>
      <v-radio-group
        v-model="row"
        row
      >
        <v-radio
          label="Option 1"
          value="radio-1"
          row
        ></v-radio>
        <v-radio
          label="Option 2"
          value="radio-2"
        ></v-radio>
      </v-radio-group>
    </v-app-bar>

    <v-navigation-drawer
      v-model="drawer"
      absolute
      temporary
    >
      <v-list
        nav
        dense
      >
        <v-list-item 
          v-for="item in sideMenu"
          :key="item"
          :to="item.path">
          <v-icon>{{ item.icon }}</v-icon>
          <v-list-item-title>{{ item.name }}</v-list-item-title>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
  </header>
</template>

<script>
import v_menus from '@/assets/vMenus.js'

  export default {
    name: 'main-header',
    data: () => ({
      appTitle: 'Title',
      drawer: false,
      group: true,
      sideMenu: v_menus,
      radioGroup: 1,
      radios: 'slide-x-transition-1',
      row: null
    }),
  }
</script>

<style scoped>
.v-icon {
  padding-right: 10px;
}
</style>