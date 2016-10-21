echo 'SCM-pipeline Jenkinsfile'

node('remote') {
  git changelog: false, credentialsId: '19221f37-3a06-4a14-afae-7f25cd423d2a', poll: false, url: 'https://github.com/ChipopoSolutions/Jenkins-playground.git'
  pwd()
  sh 'ls -alh'
  sh 'cat temp.txt'
}
