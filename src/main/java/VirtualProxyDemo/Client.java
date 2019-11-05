package VirtualProxyDemo;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hình ảnh ban đầu khi chưa gọi dịch vụ: ");
        ProxyImage proxyImage = new ProxyImage("'Đây là hình ảnh'");

        System.out.println("---------");
        System.out.println("Gọi dịch vụ lần 1: ");
        proxyImage.showImage();

        System.out.println("---------");
        System.out.println("Gọi dịch vụ lần 2: ");
        proxyImage.showImage();
    }
}
