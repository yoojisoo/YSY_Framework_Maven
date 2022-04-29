const path = require("path");
const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
  outputDir: path.resolve(__dirname, "../main/resources/static"),

  transpileDependencies: true,

  configureWebpack: {
    devtool: 'source-map'
  },

  pluginOptions: {
    vuetify: {
			// https://github.com/vuetifyjs/vuetify-loader/tree/next/packages/vuetify-loader
		}
  },

})

// __filename // 현재 파일 경로
// __direname // 현재 디렉토리
