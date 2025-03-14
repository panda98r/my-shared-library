// vars/cloneRepo.groovy
def call(repoUrl, branch = 'master') {
    git branch: branch, url: repoUrl
}
