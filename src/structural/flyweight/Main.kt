package structural.flyweight

fun main() {
    val birdImageCode = Base64Codes.birdImageCode
    val eyeImageCode = Base64Codes.eyeImageCode
    val solidImageCode = Base64Codes.solidImageCode

    val images = ArrayList<Image>()
    val imagesWithBase64 = ArrayList<ImageWithBase64>()

    val runtime = Runtime.getRuntime()
    runtime.gc()

    val factory = FlyweightFactory()
    for (i in 0 until 1000000) {
       val randomNumber = generateRandomNumber();
       var flyweight: Flyweight? = null;
       if(randomNumber == 3) {
         flyweight = factory.getFlyweight("bird", birdImageCode);
       } else if (randomNumber == 2) {
         flyweight = factory.getFlyweight("eye", eyeImageCode);
       } else {
         flyweight = factory.getFlyweight("solid", solidImageCode);
       }

       val image = Image("location", flyweight);
       images.add(image);
     }

    for (i in 0 until 1000000) {
        println(images[i].data.data[2])
    }

//    for (i in 0 until 1000000) {
//       val randomNumber = generateRandomNumber();
//       var imageWithBase64: ImageWithBase64? = null;
//       if(randomNumber == 3) {
//         imageWithBase64 = ImageWithBase64("location", birdImageCode);
//       } else if (randomNumber == 2) {
//         imageWithBase64 = ImageWithBase64("location", eyeImageCode);
//       } else {
//         imageWithBase64 = ImageWithBase64("location", solidImageCode);
//       }
//
//       imagesWithBase64.add(imageWithBase64);
//     }
//
//     for (i in 0 until 1000000) {
//         println(imagesWithBase64[i].base64Code[2])
//     }

    val memory = runtime.totalMemory() - runtime.freeMemory()
    println("Memory used: $memory bytes")

}

fun generateRandomNumber(): Int {
    return (1..3).random()
}