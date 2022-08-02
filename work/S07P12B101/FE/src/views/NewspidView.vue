<template>
  <h1>newsPid View</h1>
  <ul>
    <li><router-link to="/newspid/list">뉴스피드 리스트</router-link></li>    
  </ul>
  <newspid-header/>
  <router-view/>
</template>

<script>
import NewspidHeader from '@/components/newspid/NewspidHeader.vue'
export default {
  components: { NewspidHeader },

}
</script>

<style>

</style>