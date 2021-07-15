<template>
  <div id="app">
      <global-component></global-component>
      <local-component></local-component>
      <parent-component></parent-component>
  </div>
</template>

<script>
/* import HelloWorld from './components/HelloWorld.vue' */
import LocalComponent from './components/local-component'
import GlobalComponent from './components/global-component'
import ParentComponent from './components/parent-component'

export default {
  name: 'App',
  components: {
    LocalComponent,
    GlobalComponent,
    ParentComponent
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
