package com.study.groovy
/**
 * Created by Administrator on 2017/5/15.
 */
class Groovy04_GroovyBean {
    static void main(String[] args) {
        Car car = new Car(2017)
        println("Year : $car.year")
        println("Miles : $car.miles")
        car.miles = 25
        println("Miles : $car.miles")
    }
}

class Car {
    def miles = 0
    final year

    Car (theYear) {
        year = theYear
    }
}