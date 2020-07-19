package parking

import parking.Car.ParkingSpace.car
import parking.Car.ParkingSpace.input
import parking.Car.ParkingSpace.leaveSpotNumber
import parking.Car.ParkingSpace.parkingSpot
import parking.Car.ParkingSpace.size
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    //Car.ParkingSpace.parkingSpot.add(Car("tetteh-1", "white"))
    loop@ while(true) {
        input = scanner.nextLine().split(" ") as MutableList<String>

        when (input[0]) {
            "park" -> park()
            "leave" -> {
                leaveSpotNumber = input[1].toInt()
                leave(leaveSpotNumber)
            }
            "exit" -> break@loop
        }
    }
}

fun park() = if (parkingSpot.size <= 19) {
    car = Car(input[1].toLowerCase(), input[2])

    parkingSpot.add(car)
    if (leaveSpotNumber != 0) {
        println("${car.carColor} car parked in spot $leaveSpotNumber.")
    } else {
        println("${car.carColor} car parked in spot ${parkingSpot.size}.")
    }


} else {
    println("Sorry, the parking lot is full.")
}

fun leave(parkNumber: Int) {
    if(parkNumber <= parkingSpot.size) {
        parkingSpot.removeAt(parkNumber - 1)
        println("Spot $parkNumber is free.")
    }
}


data class Car(var registrationNumber: String, var carColor: String){
    object ParkingSpace {
        var size = 20
        var leaveSpotNumber = 0
        var input = mutableListOf<String>() // for string input
        var parkingSpot = ArrayList<Car>(size)
        var car = Car(" ", "")
    }
}


