fun main() {
    println(Solution().fizzBuzz(3))
    println(Solution().fizzBuzz(5))
    println(Solution().fizzBuzz(15))
}

class Solution {

    fun fizzBuzz(n : Int) : List<String>{

        val output : MutableList<String> = mutableListOf()
        for (i in 1..n){
            var fizzBuzz = ""
            if (i % 3 == 0){ fizzBuzz += "Fizz" }
            if (i % 5 == 0){ fizzBuzz += "Buzz" }
            if (fizzBuzz == "") { fizzBuzz = i.toString() }
            output.add(fizzBuzz)
        }
        return output
    }

}
