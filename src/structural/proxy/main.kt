package structural.proxy

import kotlin.system.measureTimeMillis

fun main() {
    client1();
    client2();
    client3();
    client4();
}

fun client1() {
    val imageDownload = ImageDownloaderProxySingleton;
    val elapsedTimeFirst = measureTimeMillis {
        print(imageDownload.getImage("https://placehold.co/600x400"));
    }

    val elapsedTimeSecond = measureTimeMillis {
        print(imageDownload.getImage("https://placehold.co/600x400"));
    }

    println("\nClient 1 - Time taken: $elapsedTimeFirst ms")
    println("\nClient 1 -Time taken for cached image: $elapsedTimeSecond ms")
}

// Client 2 is using Singleton proxy implementation
fun client2() {
    val imageDownload = ImageDownloaderProxySingleton;
    val elapsedTimeFirst = measureTimeMillis {
        print(imageDownload.getImage("https://placehold.co/600x400"));
    }

    println("\nClient 2 - Time taken for cached image: $elapsedTimeFirst ms")
}

// Client 3 is using Normal proxy implementation
fun client3() {
    val imageDownload = ImageDownloaderProxy();
    val elapsedTimeFirst = measureTimeMillis {
        print(imageDownload.getImage("https://placehold.co/600x400"));
    }

    println("\nClient 3 - Time taken for cached image: $elapsedTimeFirst ms")
}

// Client 4 is using Normal proxy implementation
fun client4() {
    val imageDownload = ImageDownloaderProxy();
    val elapsedTimeFirst = measureTimeMillis {
        print(imageDownload.getImage("https://placehold.co/600x400"));
    }

    println("\nClient 4 - Time taken for cached image: $elapsedTimeFirst ms")
}