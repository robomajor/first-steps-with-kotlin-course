class When {

    fun cases(obj: Any) {
        when (obj) {                                     // 1
            1 -> println("One")                          // 2
            "Hello" -> println("Greeting")               // 3
            is Long -> println("Long")                   // 4
            !is String -> println("Not a string")        // 5
            else -> println("Unknown")                   // 6
        }
    }

    fun whenAssign(obj: Any): Any {
        val result = when (obj) {                   // 1
            1 -> "one"                              // 2
            "Hello" -> 1                            // 3
            is Long -> false                        // 4
            else -> 42                              // 5
        }
        return result
    }

}