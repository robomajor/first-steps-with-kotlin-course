fun main() {

    val whenClass = When()

    whenClass.cases("Hello")
    whenClass.cases(1)
    whenClass.cases(0L)
    whenClass.cases(MyClass())
    whenClass.cases("hello")

    println()

    println(whenClass.whenAssign("Hello"))
    println(whenClass.whenAssign(3.4))
    println(whenClass.whenAssign(1))
    println(whenClass.whenAssign(MyClass()))

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    val whileAndDoWhile = WhileAndDoWhile()

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        whileAndDoWhile.eatACake()
        cakesEaten ++
    }

    do {
        whileAndDoWhile.bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    val ranges = Ranges()

    ranges.printRanges()

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   //Returns true because it calls authors.equals(writers) and sets ignore element order.
    println(authors === writers)  //Returns false because authors and writers are distinct references.

    fun max(a: Int, b: Int) = if (a > b) a else b         //if is an expression here: it returns a value.

    println(max(99, -42))

}

class MyClass

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}