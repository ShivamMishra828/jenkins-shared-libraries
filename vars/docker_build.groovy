def call(String ProjectName,  String ImageTag) {
    echo 'Building the code into Docker Image...'
    sh "docker build -t ${ProjectName}:${ImageTag} ."
    echo 'Builed the code successfully...'
}
