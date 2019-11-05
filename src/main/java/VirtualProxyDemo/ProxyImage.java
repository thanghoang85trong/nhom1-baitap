package VirtualProxyDemo;

public class ProxyImage implements Image {
    private Image realImage;
    private String url;

    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Hình ảnh chưa được tải: " + this.url);
    }

    @Override
    public void showImage() {
        if (realImage ==null){
            realImage = new RealImage(this.url);
        } else {
            System.out.println("Hình ảnh đã tồn tại(đã được tải): " + this.url);
        }
        realImage.showImage();
    }
}
