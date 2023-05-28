package JavaProject2;

public class Task10Tester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        chrome.open();
        chrome.close();
        chrome.getTitle();
        chrome.navigate();
        chrome.screenShot();
        System.out.println("------------");
        FireFoxDriver fox=new FireFoxDriver();
        fox.open();
        fox.close();
        fox.getTitle();
        fox.navigate();
        fox.screenShot();

        System.out.println("--------------");
        SafariDriver safari=new SafariDriver();
        safari.open();
        safari.close();
        safari.getTitle();
        safari.navigate();
        safari.screenShot();
    }
}

