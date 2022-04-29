<template>
    <v-system-bar app>
      <span style="color:white">ㅇㅇㅇ님 환영합니다.</span>
      <v-spacer></v-spacer>
      <v-btn>Notice</v-btn>
      <v-btn>Admin</v-btn>
      <v-btn>Logout</v-btn>
    </v-system-bar>
</template>

<script>
export default {
    name: 'main-system-bar',
}
</script>

<style scoped>
.v-system-bar {
  background-color: #424242;
}
.v-btn {
  color: white;
}
</style>