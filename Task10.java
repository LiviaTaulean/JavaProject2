package JavaProject2;

public interface Task10 {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends Task10{
    void navigate();

}
interface screenShot extends RemoteWebDriver{
    void screenShot();
}
class ChromeDriver implements RemoteWebDriver, screenShot {

    @Override
    public void open() {
        System.out.println("Open Chrome ");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
    @Override
    public void screenShot() {
        System.out.println("Chrome screenshot ");
    }
}
class FireFoxDriver implements RemoteWebDriver, screenShot {

    @Override
    public void open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox");
    }

    @Override
    public String getTitle() {
        return "FireFox Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FireFox ");
    }

    @Override
    public void screenShot() {
        System.out.println("FireFox screenshot");
    }
}
class SafariDriver implements RemoteWebDriver, screenShot {

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }

    @Override
    public void screenShot() {
        System.out.println("Safari screenshot");
    }
}

