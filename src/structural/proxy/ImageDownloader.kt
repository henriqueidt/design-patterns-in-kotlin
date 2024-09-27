package structural.proxy

import java.net.URL

class ImageDownloader : ImageDownloaderInt {
    override fun getImage(url: String): String {
        val imageURL = URL(url);
        val imageData = imageURL.readText();
        return imageData;
    }
}