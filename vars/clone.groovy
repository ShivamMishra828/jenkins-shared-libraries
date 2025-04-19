def call(String gitUrl, String branch) {
    echo 'Pulling the code from git repository...'
    git url: "${gitUrl}", branch: "${branch}"
    echo 'Successfully pulled code from git repository...'
}
