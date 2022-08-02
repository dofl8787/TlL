<template>
  <h1>Group View</h1>
  <ul>
    <li><router-link to="/group/main">그룹 메인</router-link></li>    
    <li><router-link to="/group/calandar">그룹 캘린더</router-link></li>    
    <li><router-link to="/group/todo">그룹 todo리스트</router-link></li>    
    <li><router-link to="/group/chart">그룹 차트</router-link></li>    
  </ul>
  <router-view/>
</template>

<script>
export default {

}
</script>

<style>

</style>