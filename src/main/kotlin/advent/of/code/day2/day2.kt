package advent.of.code.day2

const val OPPONENT_ROCK = 'A'
const val OPPONENT_PAPER = 'B'
const val OPPONENT_SCISSORS = 'C'

const val MY_ROCK = 'X'
const val MY_PAPER = 'Y'
const val MY_SCISSORS = 'Z'

data class Round(val opponentMove: Char, val move: Char)

fun day2Part1(input: String): Int {

    val rounds = input.split("\n").map {
        Round(it[0], it[2])
    }

    val roundScores = rounds.map { round ->
        when (round.opponentMove) {
            OPPONENT_ROCK -> when (round.move) {
                MY_ROCK -> 1 + 3
                MY_PAPER -> 2 + 6
                MY_SCISSORS -> 3 + 0
                else -> {
                    println("Wrong input")
                    return 0
                }
            }

            OPPONENT_PAPER -> when (round.move) {
                MY_ROCK -> 1 + 0
                MY_PAPER -> 2 + 3
                MY_SCISSORS -> 3 + 6
                else -> {
                    println("Wrong input")
                    return 0
                }
            }

            OPPONENT_SCISSORS -> when (round.move) {
                MY_ROCK -> 1 + 6
                MY_PAPER -> 2 + 0
                MY_SCISSORS -> 3 + 3
                else -> {
                    println("Wrong input")
                    return 0
                }
            }

            else -> {
                println("Wrong input")
                return 0
            }
        }
    }

    return roundScores.sum()
}