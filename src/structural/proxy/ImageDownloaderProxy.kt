package structural.proxy

class ImageDownloaderProxy : ImageDownloaderInt {
    private val imageCache = HashMap<String, String>()
    override fun getImage(url: String): String {
        if (imageCache.containsKey(url)) {
            //  The double !! is a non-null assertion operator.
            //  It converts any value to a non-null type and throws an exception if the value is null.
            return imageCache[url]!!
        }
        val imageDownloader = ImageDownloader()
        val imageData = imageDownloader.getImage(url)
        imageCache[url] = imageData
        return imageData
    }
}