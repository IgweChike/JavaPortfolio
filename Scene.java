// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
// </editor-fold>

class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Procedures and functions for this scene */
    public void myFirstMethod() {
        String input=JOptionPane.showInputDialog(null, "Enter size of UFO i");
        double size=Double.parseDouble(input);
        ufo1.setWidth(size);
        max.say("I am going to calculate circumference for each UFO");
        DecimalFormat pattern=new DecimalFormat("0.00");
        max.say("UFO 1 Circumference: "+pattern.format(ufo1.calculateCircumference()));
        max.say("UFO 2 Circumference: "+pattern.format(ufo2.calculateCircumference()));
        max.say("UFO 3 Circumference: "+pattern.format(ufo3.calculateCircumference()));
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Alien max = new Alien();
    private final UFO ufo1 = new UFO();
    private final UFO ufo2 = new UFO();
    private final UFO ufo3 = new UFO();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.847, 0.69, 0.588));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.541, 0.2, 0.0));
        this.setFogDensity(0.25);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.MARS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.098017, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.max.setPaint(Color.WHITE);
        this.max.setOpacity(1.0);
        this.max.setName("max");
        this.max.setVehicle(this);
        this.max.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.max.setPositionRelativeToVehicle(new Position(1.18, 0.0, -3.12));
        this.max.setScale(new Scale(0.565, 0.565, 0.565));
        this.max.getSpineMiddle().setPositionRelativeToVehicle(new Position(-4.29E-19, 0.0, -0.0903));
        this.max.getSpineUpper().setPositionRelativeToVehicle(new Position(5.89E-19, -9.53E-17, -0.137));
        this.max.getNeck().setPositionRelativeToVehicle(new Position(-8.99E-19, -2.81E-16, -0.0342));
        this.max.getHead().setPositionRelativeToVehicle(new Position(-2.79E-34, -6.02E-17, -0.0356));
        this.max.getMouth().setPositionRelativeToVehicle(new Position(-4.05E-4, 0.0182, -0.0633));
        this.max.getRightEye().setPositionRelativeToVehicle(new Position(0.0438, 0.135, -0.0284));
        this.max.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0446, 0.135, -0.0284));
        this.max.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0446, 0.135, -0.0284));
        this.max.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0438, 0.135, -0.0284));
        this.max.getRightHip().setPositionRelativeToVehicle(new Position(0.0698, -0.0014, -0.0543));
        this.max.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 1.05E-16, -0.0815));
        this.max.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 1.0E-17, -0.0801));
        this.max.getRightFoot().setPositionRelativeToVehicle(new Position(-4.01E-17, 3.51E-17, -0.0586));
        this.max.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0698, -0.0014, -0.0543));
        this.max.getLeftKnee().setPositionRelativeToVehicle(new Position(-1.0E-17, 3.84E-17, -0.0815));
        this.max.getLeftAnkle().setPositionRelativeToVehicle(new Position(-1.0E-17, -3.51E-17, -0.0801));
        this.max.getLeftFoot().setPositionRelativeToVehicle(new Position(-1.0E-17, -7.28E-17, -0.0586));
        this.max.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0356, -0.033, -0.00172));
        this.max.getRightShoulder().setPositionRelativeToVehicle(new Position(-1.51E-17, -1.61E-16, -0.0421));
        this.max.getRightElbow().setPositionRelativeToVehicle(new Position(-3.26E-16, -8.03E-17, -0.113));
        this.max.getRightWrist().setPositionRelativeToVehicle(new Position(-2.41E-16, -2.41E-16, -0.089));
        this.max.getRightHand().setPositionRelativeToVehicle(new Position(-1.51E-17, 0.0, -0.0392));
        this.max.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0148, -0.00696, -0.0582));
        this.max.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(-1.2E-16, 4.82E-16, -0.036));
        this.max.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0019, -0.00793, -0.0624));
        this.max.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(-2.01E-17, 0.0, -0.0377));
        this.max.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(0.0141, -0.00866, -0.0621));
        this.max.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(1.23E-16, 1.61E-16, -0.0365));
        this.max.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0282, -0.00973, -0.057));
        this.max.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(5.02E-17, 1.61E-16, -0.0332));
        this.max.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0356, -0.033, -0.00172));
        this.max.getLeftShoulder().setPositionRelativeToVehicle(new Position(1.0E-17, -4.82E-16, -0.0421));
        this.max.getLeftElbow().setPositionRelativeToVehicle(new Position(-8.78E-17, 6.38E-14, -0.113));
        this.max.getLeftWrist().setPositionRelativeToVehicle(new Position(3.29E-16, 5.05E-14, -0.089));
        this.max.getLeftHand().setPositionRelativeToVehicle(new Position(3.51E-17, -6.42E-16, -0.0392));
        this.max.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0148, -0.00696, -0.0582));
        this.max.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(8.03E-17, 1.61E-16, -0.036));
        this.max.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0019, -0.00793, -0.0624));
        this.max.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(-3.01E-17, 1.61E-16, -0.0377));
        this.max.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(-0.0141, -0.00866, -0.0621));
        this.max.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(-4.52E-17, -1.61E-16, -0.0365));
        this.max.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0282, -0.00973, -0.057));
        this.max.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, -1.61E-16, -0.0332));
        this.ufo1.setPaint(Color.WHITE);
        this.ufo1.setOpacity(1.0);
        this.ufo1.setName("ufo1");
        this.ufo1.setVehicle(this);
        this.ufo1.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufo1.setPositionRelativeToVehicle(new Position(-3.61, 0.0, 5.85));
        this.ufo1.setScale(new Scale(0.47, 0.47, 0.47));
        this.ufo1.getFin().setPositionRelativeToVehicle(new Position(0.0, 0.493, 0.764));
        this.ufo1.getRightDoor().setPositionRelativeToVehicle(new Position(0.0, -0.445, -0.0423));
        this.ufo1.getLeftDoor().setPositionRelativeToVehicle(new Position(0.0, -0.445, -0.0423));
        this.ufo2.setPaint(Color.WHITE);
        this.ufo2.setOpacity(1.0);
        this.ufo2.setName("ufo2");
        this.ufo2.setVehicle(this);
        this.ufo2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufo2.setPositionRelativeToVehicle(new Position(2.95, 0.0, 4.11));
        this.ufo2.setScale(new Scale(0.59, 0.59, 0.59));
        this.ufo2.getFin().setPositionRelativeToVehicle(new Position(0.0, 0.619, 0.959));
        this.ufo2.getRightDoor().setPositionRelativeToVehicle(new Position(0.0, -0.558, -0.0532));
        this.ufo2.getLeftDoor().setPositionRelativeToVehicle(new Position(0.0, -0.558, -0.0532));
        this.ufo3.setPaint(Color.WHITE);
        this.ufo3.setOpacity(1.0);
        this.ufo3.setName("ufo3");
        this.ufo3.setVehicle(this);
        this.ufo3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufo3.setPositionRelativeToVehicle(new Position(-0.338, 0.0, 3.51));
        this.ufo3.setScale(new Scale(0.265, 0.265, 0.265));
        this.ufo3.getFin().setPositionRelativeToVehicle(new Position(0.0, 0.278, 0.431));
        this.ufo3.getRightDoor().setPositionRelativeToVehicle(new Position(0.0, -0.251, -0.0239));
        this.ufo3.getLeftDoor().setPositionRelativeToVehicle(new Position(0.0, -0.251, -0.0239));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Procedures and functions to handle multiple scenes */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Alien getMax() {
        return this.max;
    }

    public UFO getUfo1() {
        return this.ufo1;
    }

    public UFO getUfo2() {
        return this.ufo2;
    }

    public UFO getUfo3() {
        return this.ufo3;
    }
    // </editor-fold>
}
