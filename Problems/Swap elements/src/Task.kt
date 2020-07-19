// The array numbers already exists. Write only exchange actions here.
var first = numbers.first()
var last = numbers.last()

numbers[0] = last
numbers[numbers.lastIndex] = first
