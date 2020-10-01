// demo.buildUtils

package demo

def timedGradleBuild(tasks) {
   timestamps {
      sh "echo {tasks}"
   }
}
