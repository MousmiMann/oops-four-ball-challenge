
import processing.core.PApplet;

public class BallChallenge extends PApplet implements draw {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int firstBallWidth = 0;
    public static int secondBallWidth = 0;
    public static int thirdBallWidth = 0;
    public static int fourthBallWidth = 0;
    public static void main(String[] args) {
        PApplet.main("BallChallenge", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);


    }
    @Override
    public void draw() {
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawFourthBall();
    }


    public void drawFirstBall() {

        ellipse(firstBallWidth,10,10, 10);
        firstBallWidth++;
    }
    public void drawSecondBall() {
        ellipse(secondBallWidth,100,10, 10);
        secondBallWidth+=2;
    }

    public void drawThirdBall() {

        ellipse(thirdBallWidth,250,10, 10);
        thirdBallWidth+=3;
    }
    public void drawFourthBall() {
        ellipse(fourthBallWidth,450,10, 10);
        fourthBallWidth+=4;
    }
    public void paintwhite() {
        background(255);
    }
}