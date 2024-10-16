package fr.meteochomage.parkshare.domainLayer.model

import java.util.Date

data class Spot(
    val location: Location,
    val price   : Double,
    val unavailableTimeSlot : List<Date>
)
