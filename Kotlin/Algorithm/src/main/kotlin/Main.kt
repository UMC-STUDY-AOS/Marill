package org.example.Algorithm

fun main(){

    val eventPrinter = EventPrinter()
    eventPrinter.start()
}

interface EventListener {
    fun onEvent(count : Int)
}

class Counter(var listener : EventListener) {

    fun count(){
        for (i in 1..100){
            if (i%5==0){
                listener.onEvent(i)
            }
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}