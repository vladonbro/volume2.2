fun main(args: Array<String>) {
    //Эта программа считает объём параллелепипеда.

    println("Введите длину:")
    val side1 = readln().toInt()

    println("Введите ширину:")
    val side2 = readln().toInt()

    println("Введите высоту:")
    val side3 = readln().toInt()

    println("Объём такого параллелепипеда:")
    val perimeter = side1 * side2 * side3

    println(perimeter)
}