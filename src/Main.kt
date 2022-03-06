fun main() {
    println("------------Welcome to BCAS Cargo------------")
    print("Please enter your name: ")
    val name = readLine()
    println("Hi $name, We offer several cargo delivery options")
    println("A. Land Transport")
    println("B. Air Transport")
    print("Type 'A' for Land Transport OR Type 'B' for Air Transport: ")
    val type = readLine()

    if(type == null || type.isEmpty()){
        println("invalid entry! ")
        main()
    }

    print("Enter item weight (Kg) : ")
    var itemWeight = readLine()?.toFloatOrNull()
    if(itemWeight == null){
        itemWeight = 0.0f
    }

    print("Enter item capacity (Vol) : ")
    val itemCapacity = readLine()?.ifBlank { null } ?: "INVALID!"
    println("\n")

    if (type == "A" || type == "a"){
        val kargoDarat = LandTransport (itemWeight!!, "$itemCapacity", 80.2f, "Darat", "JNE Cargo")
        kargoDarat.ship()
        kargoDarat.load()
        println(Transportation(kargoDarat))
        kargoDarat.unload()
    }
    else if(type == "B" || type == "b"){
        val kargoUdara = AirTransport (itemWeight!!, "$itemCapacity", 409.5f, "Udara", "Lion-Air Parcel")
        kargoUdara.ship()
        kargoUdara.load()
        println(Transportation(kargoUdara))
        kargoUdara.unload()
    }

    print("do you want to repeat the process? (Y/N) : ")
    val ask = readLine()
    if(ask == "Y" || ask == "y"){
        main()
    }


}



