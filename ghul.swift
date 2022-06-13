var a = 1000
var b = 7
while a > b {
	var c = a - b
	print("\(a) - \(b) = \(c)")
	a = c
  //В swift для windows почему-то не работает sleep, пришлось искать обходной путь)
	var d = 100000000
	while d != 0 {
		d -= 1
	}
}
print("I'm Ghul!")
