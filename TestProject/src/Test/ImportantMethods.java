package Test;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
/* Screenshot using selenium wedbriver for current page:  
       File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       Files.copy(f, new File("D:\\Screenshots\\ss.jpg"));
 
 * Screenshot using selenium for capturing entire webpage:
       File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(f, new File("D:\\Screenshots\\ss.jpg"));
  
 * Screenshot using Ashot: 
       Screenshot s = new AShot().takeScreenshot(driver);
       ImageIO.write(s.getImage(),"JPG",new File("D:\\Screenshots\\ss.jpg"));
  
 * Screenshot using ashot for entire webpage:
       Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
       ImageIO.write(s.getImage(),"JPG",new File("D:\\Screenshots\\ss.jpg"));
 */
