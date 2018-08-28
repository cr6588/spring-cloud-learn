<template>
<div>
    main</div>
</template>

<script>
export default {
    data() {
        this.$store.commit('updateHeaderMenu', this.$route.path)
        return {}
    }
}
</script>
