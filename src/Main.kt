//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Введите строку: ")
    val input = readLine() ?: ""

    val result = StringBuilder()
    var i = 0
    while (i < input.length) {
        val char = input[i]
        var count = 1
        var j = i + 1
        while (j < input.length && input[j] == char) {
            count++
            j++
        }

        result.append(char)
        if (count > 1) {
            result.append(count)
        }
        i += count

    }
    println("Результат: $result")
}