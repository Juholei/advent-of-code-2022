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

data class Part2Round(val opponentMove: Char, val result: Char)

const val LOSS = 'X'
const val DRAW = 'Y'
const val WIN = 'Z'

fun day2Part2(input: String): Int {

    val rounds = input.split("\n").map {
        Part2Round(it[0], it[2])
    }
// The score for a single round is the score for the shape you
// selected (1 for Rock, 2 for Paper, and 3 for Scissors)
// plus the score for the outcome of the round
// (0 if you lost, 3 if the round was a draw, and 6 if you won).
    val roundScores = rounds.map { round ->
        when (round.opponentMove) {
            OPPONENT_ROCK -> when (round.result) {
                LOSS -> 3 + 0
                DRAW -> 1 + 3
                WIN -> 2 + 6
                else -> {
                    println("Wrong input")
                    return 0
                }
            }

            OPPONENT_PAPER -> when (round.result) {
                LOSS -> 1 + 0
                DRAW -> 2 + 3
                WIN -> 3 + 6
                else -> {
                    println("Wrong input")
                    return 0
                }
            }

            OPPONENT_SCISSORS -> when (round.result) {
                LOSS -> 2 + 0
                DRAW -> 3 + 3
                WIN -> 1 + 6
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