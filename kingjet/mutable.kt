fun main() {
   val anyList = mutableListOf ('a', "kotlin", 12, false)
   anyList.add(2, "jangan")
   println(anyList)
   anyList.add(4, "true")
   println(anyList)
   anyList.add("kamu")
   println(anyList)
   anyList.add('A')
}
