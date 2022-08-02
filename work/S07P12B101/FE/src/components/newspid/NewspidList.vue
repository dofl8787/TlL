<template>
  <h2>newspid List</h2>
  <b-card style="max-width: 70rem; background-color: #FBF1EE;">
    <b-container ref="form">
      <b-row>
        <b-col>
          <b-img src="https://picsum.photos/1024/400/?image=41" fluid alt="Responsive image"></b-img>
        </b-col>
        <b-col style="background-color: #ffffff;">
          <b-row>
            <b-col cols="2">
              <b-avatar variant="info" src="https://placekitten.com/300/300" size="50px"></b-avatar>
            </b-col>
            <b-col>
              <b-row>
                <div style="width: 90px; display: inline; padding: 4px 0px;">Brown_Cat</div>
                <a style="color: blue; width: 75px; text-decoration: none; padding: 4px;">팔로우</a>
              </b-row>
              <b-row>런던</b-row>
            </b-col>
          </b-row>
          <hr style="margin: 5px;">
          <b-row>
            <b-col cols="2">
              <b-avatar variant="info" src="https://placekitten.com/300/300" size="50px"></b-avatar>
            </b-col>
            <b-col>
              <b-row>
                <div style="width: 90px; padding: 4px 0px;">Brown_Cat</div>
              </b-row>
              <b-row>
                <div style="width: 200px; padding: 4px 0px;">공부를 놓지 않는다. 취한다.</div>
              </b-row>
            </b-col>
          </b-row>
        </b-col>
      </b-row>
    </b-container>
  </b-card>
</template>

<script>
export default {

}
</script>

<style>

</style>