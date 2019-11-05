package VirtualProxyDemo;

public class RealImage implements Image {
    private String url;
    public RealImage(String url){
        this.url = url;
        System.out.println("Hình ảnh đã đưuọc tải: " + this.url);
    }
    @Override
    public void showImage() {
        System.out.println("Hình ảnh đã được hiển thị: " + this.url);
    }
}
