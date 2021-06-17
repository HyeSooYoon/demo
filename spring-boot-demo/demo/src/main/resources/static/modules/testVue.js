state: { storeNum: 10 },
mutations: {
  modifyState(state, payload) {
    console.log(payload.str);
    return state.storeNum += payload.num;
  }
}

// App.vue
this.$store.commit('modifyState', {
  str: 'passed from payload',
  num: 20
});


this.$store.commit('printNumbers');
this.$store.commit('sumNumbers', 20);