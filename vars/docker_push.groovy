def call(String ProjectName, String ImageTag) {
  withCredentials([usernamePassword(credentialsId: 'dockerCred', passwordVariable: 'dockerHubUser', usernameVariable: 'dockerHubPass')]) {
      sh """
        docker login -u ${dockerHubUser} -p ${dockerHubPass}
        docker push ${dockerHubUser}/${ProjectName}:${ImageTag}
      """
  }
}
