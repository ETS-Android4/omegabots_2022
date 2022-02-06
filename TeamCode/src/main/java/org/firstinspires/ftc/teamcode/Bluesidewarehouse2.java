package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "11520-  Bluesidewarehouse2 (Blocks to Java)")
public class Bluesidewarehouse2 extends LinearOpMode {

    private Servo claw;
    private DcMotor FrontLeft;
    private DcMotor BackLeft;
    private DcMotor Arm;
    private DcMotor FrontRight;
    private DcMotor BackRight;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        claw = hardwareMap.get(Servo.class, "claw");
        FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        Arm = hardwareMap.get(DcMotor.class, "Arm");
        FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        BackRight = hardwareMap.get(DcMotor.class, "BackRight");

        claw.setPosition(0);
        FrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        BackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        if (opModeIsActive()) {
            Arm.setPower(-0.75);
            sleep(950);
            Arm.setPower(0);
            sleep(100);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(0.5);
            BackLeft.setPower(0.5);
            BackRight.setPower(0.5);
            sleep(500);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(-0.5);
            BackLeft.setPower(0.5);
            BackRight.setPower(-0.5);
            sleep(300);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(0.5);
            BackLeft.setPower(0.5);
            BackRight.setPower(0.5);
            sleep(200);
            FrontLeft.setPower(0);
            FrontRight.setPower(0);
            BackLeft.setPower(0);
            BackRight.setPower(0);
            sleep(1000);
            claw.setPosition(1);
            sleep(100);
            BackLeft.setPower(0);
            BackRight.setPower(0);
            BackLeft.setPower(0);
            BackRight.setPower(0);
            sleep(2000);
            FrontLeft.setPower(-0.5);
            FrontRight.setPower(-0.5);
            BackLeft.setPower(-0.5);
            BackRight.setPower(-0.5);
            sleep(200);
            FrontLeft.setPower(0);
            FrontRight.setPower(0);
            BackLeft.setPower(0);
            BackRight.setPower(0);
            sleep(500);
            claw.setPosition(0);
            sleep(500);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(-0.5);
            BackLeft.setPower(0.5);
            BackRight.setPower(-0.5);
            sleep(250);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(-0.5);
            BackLeft.setPower(-0.5);
            BackRight.setPower(0.5);
            sleep(950);
            FrontLeft.setPower(-0.5);
            FrontRight.setPower(-0.5);
            BackLeft.setPower(-0.5);
            BackRight.setPower(-0.5);
            sleep(1500);
        }
    }
}
