eventCreateWarStart = { warName, stagingDir ->
    def buildNumber = System.getenv('build.number')
    if(buildNumber) {
        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
            entry(key:'buildnumber', value: buildNumber)
        }
    }
}