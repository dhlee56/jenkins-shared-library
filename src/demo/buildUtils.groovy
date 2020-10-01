package org.demo
def timedGradleBuild(tasks) {
   timestamps {
      sh "echo my test!"
   }
}
