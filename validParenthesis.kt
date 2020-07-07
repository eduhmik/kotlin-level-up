// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.

// Example 1:

// Input: "()"
// Output: true
// Example 2:

// Input: "()[]{}"
// Output: true
// Example 3:

// Input: "(]"
// Output: false
// Example 4:

// Input: "([)]"
// Output: false
// Example 5:

// Input: "{[]}"
// Output: true

class Solution {
    val mappings = HashMap<Char, Char>()
        
    init {
        mappings.put('(', ')')
        mappings.put('{', '}')
        mappings.put('[', ']')
    }
    fun isValid(s: String): Boolean {
        println(s)
        val stack = Stack<Char>()
        var i : Int = 0
        var c : Char
        
        for (i in s.length - 1 downTo 0 step 1) {
            c = s.get(i)
            if (mappings.containsKey(c)) {
                var topElement = if (stack.empty()) '#' else stack.pop()
                
                if (topElement != mappings.get(c)) {
                    return false 
                }
            } else {
                stack.push(c)
            }
        }
        
        return stack.isEmpty()
    }
}