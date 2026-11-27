class Solution {
  fun isAnagram(a: String, b: String): Boolean {

        var anagram = b.takeIf { a.length == it.length }?.let(::StringBuilder) ?: return false

        for (char in a){
            anagram.indexOf(char)
                .takeIf { it != -1 }
                ?.let { index ->
                    anagram = anagram.deleteCharAt(index)
                } ?: return false
        }

        return true

    }
}
