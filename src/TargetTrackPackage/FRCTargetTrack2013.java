package TargetTrackPackage;

import edu.wpi.first.smartdashboard.properties.BooleanProperty;
import edu.wpi.first.smartdashboard.properties.DoubleProperty;
import edu.wpi.first.smartdashboard.properties.IntegerProperty;
import edu.wpi.first.wpijavacv.WPIColorImage;
import edu.wpi.first.wpijavacv.WPIImage;

public class FRCTargetTrack2013 extends WPICameraExtension {
    private DoubleProperty polygonQuality;
    private IntegerProperty erodeAmount;
    private IntegerProperty dilateAmount;
    
    private IntegerProperty redMinProperty;
    private IntegerProperty redMaxProperty;
    private IntegerProperty greenMinProperty;
    private IntegerProperty greenMaxProperty;
    private IntegerProperty blueMinProperty;
    private IntegerProperty blueMaxProperty;
    
    public static final String NAME = "Camera Target Analysis";
    
    public FRCTargetTrack2013() {
        //mutable properties - (when extension is added to SmartDashboard, right click it for properties)
        polygonQuality = new DoubleProperty(this, "Polygon Quality", 30);
        erodeAmount = new IntegerProperty(this, "Erode Amount", 0);
        dilateAmount = new IntegerProperty(this, "Dilate Amount", 9);
        redMinProperty = new IntegerProperty(this, "Red Minimum", 0);
        redMaxProperty = new IntegerProperty(this, "Red Maximum", 225);
        greenMinProperty = new IntegerProperty(this, "Green Minimum", 0);
        greenMaxProperty = new IntegerProperty(this, "Green Maximum", 255);
        blueMinProperty = new IntegerProperty(this, "Blue Minimum", 0);
        blueMaxProperty = new IntegerProperty(this, "Blue Maximum", 255);
    }
    
    @Override
    public WPIImage processImage(WPIColorImage rawImage) {
        
        //do image processing logic here
        
        return rawImage;
    }
}
