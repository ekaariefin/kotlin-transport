class LandTransport(
    override var weight: Float,
    override var capacity: String,
    override var speed: Float,
    var transportation_mode: String,
    var vehicle_type: String) : Transport {


    override fun ship() {
        println("In land transport, shipping is done via Truck")
    }

    override fun toString(): String {
        return "--------- ROAD CARGO RECEIPT ---------\n" +
                "Weight : $weight \n" +
                "Capacity :  $capacity \n" +
                "Speed : $speed \n" +
                "Transportation Mode : $transportation_mode \n" +
                "Vehicle Type : $vehicle_type \n" +
                "Estimated Delivery : 3-7 Days"
    }

    }


