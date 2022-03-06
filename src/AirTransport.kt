class AirTransport(
    override var weight: Float,
    override var capacity: String,
    override var speed: Float,
    var aircraft_type: String,
    var airline_name: String)
    : Transport {

    override fun ship() {
        println("In air transport, shipping is done via air cargo")
    }

    override fun toString(): String {
        return "--------- AIRLINE CARGO RECEIPT ---------\n" +
                "Weight : $weight \n" +
                "Capacity :  $capacity \n" +
                "Speed : $speed \n" +
                "Aircraft Type : $aircraft_type \n" +
                "Airline Name : $airline_name \n" +
                "Estimated Delivery : 1-2 Days"
    }
}