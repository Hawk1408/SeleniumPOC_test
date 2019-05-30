import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotMethods {
    /**
     *
     * @param waitTimeSecs
     * @throws Exception
     */
    public static void pressEnterAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(waitTimeSecs);
    }

    /**
     *
     * @param waitTimeSecs
     * @throws Exception
     */
    public static void pressEscapeAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(waitTimeSecs);
    }

    /**
     *
     * @param waitTimeSecs
     * @throws Exception
     */
    public static void pressFAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        Thread.sleep(waitTimeSecs);
    }

    public static void pressMAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(waitTimeSecs);
    }

    public static void pressKAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        Thread.sleep(waitTimeSecs);
    }
    public static void pressUpAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(waitTimeSecs);
    }

    public static void pressDownAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_KP_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(waitTimeSecs);
    }
    public static void pressSpaceAndWait(int waitTimeSecs) throws Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(waitTimeSecs);
    }

    public static void pressArrowDown(int pressTimes) throws java.lang.Exception{
        for(int i = 0; i < pressTimes;i ++)
        pressDownAndWait(100);
    }

    public static void pressArrowUp(int pressTimes) throws java.lang.Exception{
        for(int i = 0; i < pressTimes;i ++)
            pressUpAndWait(100);
    }
    public static void click() throws java.lang.Exception{
        java.awt.Robot robot = new java.awt.Robot();
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

}
