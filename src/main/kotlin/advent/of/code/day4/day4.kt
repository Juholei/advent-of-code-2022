package advent.of.code.day4

data class ElfPair(val elf1Assignments: List<Int>, val elf2Assignments: List<Int>)

fun day4Part1(input: String): Int {
    val output = input.split("\n")
        .map { it.split(",") }
        .map {
            val elf1 = it[0].split("-")
                .map { section -> section.toInt() }
            val elf2 = it[1].split("-")
                .map { section -> section.toInt() }
            ElfPair(
                IntRange(elf1[0], elf1[1]).toList(),
                IntRange(elf2[0], elf2[1]).toList()
            )
        }
        .map { elfPair ->
            elfPair.elf1Assignments.containsAll(elfPair.elf2Assignments) ||
                    elfPair.elf2Assignments.containsAll(elfPair.elf1Assignments)
        }
        .filter { it }
    println(output)
    return output.count()
}

fun day4Part2(input: String): Int {
    val output = input.split("\n")
        .map { it.split(",") }
        .map {
            val elf1 = it[0].split("-")
                .map { section -> section.toInt() }
            val elf2 = it[1].split("-")
                .map { section -> section.toInt() }
            ElfPair(
                IntRange(elf1[0], elf1[1]).toList(),
                IntRange(elf2[0], elf2[1]).toList()
            )
        }
        .map { elfPair ->
            elfPair.elf1Assignments.intersect(elfPair.elf2Assignments.asIterable().toSet()).isNotEmpty()
        }
        .filter { it }
    println(output)
    return output.count()
}