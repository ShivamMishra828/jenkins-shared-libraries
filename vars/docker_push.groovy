def call(String Project, String ImageTag) {
    echo 'Pushing the image to Docker Hub...'
    withCredentials([usernamePassword(
                    'credentialsId': 'DockerHubCred',
                    passwordVariable: 'DockerHubPass',
                    usernameVariable: 'DockerHubUser')]) {
        sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass}"
        sh "docker image tag ${Project}:${ImageTag} ${env.DockerHubUser}/${Project}:${ImageTag}"
        sh "docker push ${env.DockerHubUser}/${Project}:${ImageTag}"
                    }
    echo 'Done pushing the image to Docker Hub...'
}
