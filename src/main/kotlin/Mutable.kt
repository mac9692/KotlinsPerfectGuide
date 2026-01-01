fun main() {
    var sum = 1
    sum += 2
    sum += 3

    println(sum)
    println(++sum)
    println(sum++)

    val set = sortedSetOf(Double.NaN, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 0.0)
    println(set)
}
