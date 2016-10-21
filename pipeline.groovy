{ ->
  node('remote') {
    hello 'world'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
