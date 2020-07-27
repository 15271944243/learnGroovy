/**
 * 闭包
 * @author: xiaoxiaoxiang
 * @date: 2020/7/27 14:56
 */
class Closure {

    static void main (String[] args) {
        def clos = {param->println "Hello ${param}"}
        clos.call("World")
    }
}
