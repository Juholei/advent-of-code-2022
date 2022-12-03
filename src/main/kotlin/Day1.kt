fun day1(input: String): Int {
    val splitInput = input.split("\n\n")
    val output = splitInput.map { it.split("\n") }
        .map { inventory -> inventory.map { item -> item.toInt() } }
        .map { inventory -> inventory.sum() }
    println(output.max())
    return output.max()
}