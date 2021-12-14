import scala.sys.process._


println("Running Curl")
val result: String = "curl --silent https://artifact.miloszjakubanis.com".!!
println("Curl Finished")

if(result.isBlank) {
  println("Failed")
} else println("Success")


