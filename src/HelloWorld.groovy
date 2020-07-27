/**
 * @description:
 * @author: xiaoxiaoxiang
 * @date: 2020/7/27 13:45
 */
println("hello world")

def clos = {println "Hello World"}

clos.call()

def number = 1
def eagerGString = "value == ${number}"
def lazyGString = "value == ${ -> number }"

assert eagerGString == "value == 1"
assert lazyGString ==  "value == 1"

number = 2
assert eagerGString == "value == 1"
assert lazyGString ==  "value == 2"

//Closure.main()