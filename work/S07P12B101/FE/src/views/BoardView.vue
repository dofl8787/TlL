<template>
<b-container>
  <h1>Board View</h1>
  <ul>
    <li><router-link to="/board/main">게시글 메인</router-link></li>
    <li><router-link to="/board/list">게시글 더보기</router-link></li>
    <li><router-link to="/board/detail">게시글 보기</router-link></li>
  </ul>
  <router-view></router-view>
</b-container>
</template>

<script>
export default {
    name:"BoardView",
};
</script>

<style>

</style>