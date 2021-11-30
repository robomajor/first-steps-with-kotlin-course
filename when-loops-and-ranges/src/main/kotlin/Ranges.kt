class Ranges {

    fun printRanges() {
        for(i in 0..3) {             //Iterates over a range starting from 0 up to 3 (inclusive).
            print(i)
        }
        print(" ")

        for(i in 0 until 3) {        //Iterates over a range starting from 0 up to 3 (exclusive).
            print(i)
        }
        print(" ")

        for(i in 2..8 step 2) {      //Iterates over a range with a custom increment step for consecutive elements.
            print(i)
        }
        print(" ")

        for (i in 3 downTo 0) {      //Iterates over a range in reverse order.
            print(i)
        }
        print(" ")

        for (i in 10 downTo 0 step 2) {      //Iterates over a range in reverse order with a custom increment step.
            print(i)
        }
        print(" ")

        for (c in 'a'..'d') {        //Iterates over a char range in alphabetical order.
            print(c)
        }
        print(" ")

        for (c in 'z' downTo 's' step 2) { //Char ranges support step and downTo as well.
            print(c)
        }
        print(" ")

        val x = 2
        if (x in 1..5) {            //Checks if a value is in the range.
            print("x is in range from 1 to 5")
        }
        println()

        if (x !in 6..10) {          //!in is the opposite of in.
            print("x is not in range from 6 to 10")
        }
    }

}