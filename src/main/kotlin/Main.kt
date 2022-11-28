fun main() {
    //Эта программа считает объём параллелепипеда.

    println("Введите длину:")
    val side1 = readln().toInt()

    println("Введите ширину:")
    val side2 = readln().toInt()

    println("Введите высоту:")
    val side3 = readln().toInt()

    println("Объём такого параллелепипеда:")
    val volume = side1 * side2 * side3

    println(volume)
}
