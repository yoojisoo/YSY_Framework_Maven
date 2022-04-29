<template>
  <v-card
    flat
    tile
    width="100%"
    class="text-center"
    elevation="2"
  >
    <v-card-text class="white--text">
      {{ new Date().getFullYear() }} — <strong>㉧㉦㉧ Framework</strong>
    </v-card-text>
  </v-card>
</template>

<script>
  export default {
    name: 'main-footer',
  }
</script>