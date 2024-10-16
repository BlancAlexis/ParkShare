package fr.meteochomage.parkshare.model

import java.util.Date

data class Spot(
    val location: Location,
    val price   : Double,
    val unavailableTimeSlot : List<Date>
)
