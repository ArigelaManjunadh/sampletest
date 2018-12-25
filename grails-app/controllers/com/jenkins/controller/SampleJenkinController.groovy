package com.jenkins.controller

class SampleJenkinController {

    def index() { }
	
	def sample(){
	def buildNumber = grailsApplication.metadata['build.number']
	
	println(buildNumber)

	
	}
}
