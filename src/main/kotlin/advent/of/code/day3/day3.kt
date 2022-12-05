package advent.of.code.day3

data class Rucksack(val compartment1: CharArray, val compartment2: CharArray)


val alphabetValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    .mapIndexed { index, character ->
        Pair(character, index + 1)
    }.toMap()

fun day3Part1(input: String): Int {
    val output = input.split("\n").map { rucksack ->
        Rucksack(
            rucksack.substring(0, rucksack.length / 2).toCharArray(),
            rucksack.substring(rucksack.length / 2, rucksack.length).toCharArray()
        )
    }.map { rucksack ->
        rucksack.compartment1.intersect(rucksack.compartment2.asIterable().toSet()).first()
    }.mapNotNull {
        alphabetValues[it]
    }

    return output.sum()
}

fun day3Part2(input: String): Int {
    val output = input.split("\n")
        .chunked(3)
        .map { group ->
            group[0].asIterable()
                .intersect(group[1].asIterable().toSet())
                .intersect(group[2].asIterable().toSet())
                .first()
        }
        .mapNotNull {
            alphabetValues[it]
        }
    println(output)
    return output.sum()
}