

fun main(args: Array<String>) {
    var base = Child()
    base.displayName()
    base.displayPrice()

    println("Animal make noise and goto Sleep")
    var animal = Animal()
    animal.makeNoise()
    animal.gotoSleep()

    println("Cat make noise and goto Sleep")
    animal = Cat()
    animal.makeNoise()
    animal.gotoSleep()

    println("Dog make noise and goto Sleep")
    animal = Dog()
    animal.makeNoise()
    animal.gotoSleep()
}