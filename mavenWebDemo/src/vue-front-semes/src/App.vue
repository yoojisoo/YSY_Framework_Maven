<template>
  <v-app>
    <main-system-bar/>
    <main-header/>

    <v-main app>
      <v-container fluid>
        <router-view/>
      </v-container>
    </v-main>

    <main-footer/>
  </v-app>
</template>

<script>
import MainSystemBar from '@/components/TheSystemBar.vue'
import MainHeader from '@/components/TheHeader.vue'
import MainFooter from '@/components/TheFooter.vue'

  export default {
    components: {
      'main-system-bar': MainSystemBar,
      'main-header': MainHeader,
      'main-footer': MainFooter
    },
  }
</script>