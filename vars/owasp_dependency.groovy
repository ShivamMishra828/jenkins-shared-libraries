def call() {
    dependencyCheck additionalArguments: '--scan ./ --exclude node_modules', odcInstallation: "OWASP"
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
