fun main() {
    println(Solution().fizzBuzz(3))
    println(Solution().fizzBuzz(5))
    println(Solution().fizzBuzz(15))
}

class Solution {
    fun fizzBuzz(n: Int): List<String> {

        val output = mutableListOf<String>()

        for(x in 1..n){
            if(x % 3 == 0 && x % 5 == 0){
                output.add("FizzBuzz")}
            else if(x % 3 == 0){
                output.add("Fizz")
            } else if(x % 5 == 0){
                output.add("Buzz")
            } else
                output.add(x.toString())
        }
        return output
    }
}
