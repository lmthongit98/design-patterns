package structural.observer;

import structural.observer.notifiers.EmailNotifier;
import structural.observer.notifiers.PhoneNotifier;
import structural.observer.notifiers.YoutubeNotifier;

public class Client {

    public static void main(String[] args) {
        var videoData = new VideoData();
        var emailNotifier = new EmailNotifier(videoData);
        var phoneNotifier = new PhoneNotifier(videoData);
        var youtubeNotifier = new YoutubeNotifier(videoData);
        videoData.setTitle("Observer design pattern");
        videoData.detachObserver(emailNotifier);
        System.out.println("\n-------------------");
        System.out.println("After detaching email notifier");
        videoData.setDescription("Study observer design pattern");

    }

}
