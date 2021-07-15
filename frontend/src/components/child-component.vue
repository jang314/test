<template>
	<div>
		<button @click="sendEvent()">Print</button>
	</div>
</template>

<script>
import ChildComponent from './components/child-component'
export default {
	name : 'child-component',
	props : {
		parentMessage : {
			type: String,
			default : void 0
		}
	},
	methods: {
		sendEvent() {
			this.$emit('print', this.parentMessage)
		}
	}
}
</script>