package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp(name = "11520-TestTeleOpOmegabots")
public class TestTeleOpOmegabots extends LinearOpMode {

  private DcMotor FrontLeft;
  private DcMotor BackLeft;
  private Servo claw;
  private DcMotor FrontRight;
  private DcMotor BackRight;
  private DcMotor Spinner;
  private DcMotor Armswivel;
  private DcMotor Arm;
  private TouchSensor touchsensor;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
    BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
    claw = hardwareMap.get(Servo.class, "claw");
    FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
    BackRight = hardwareMap.get(DcMotor.class, "BackRight");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");
    Armswivel = hardwareMap.get(DcMotor.class, "Arm swivel");
    Arm = hardwareMap.get(DcMotor.class, "Arm");
    touchsensor = hardwareMap.get(TouchSensor.class, "touch sensor");

    // Put initialization blocks here.
    FrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    BackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    claw.setPosition(1);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        if (gamepad1.dpad_up) {
          FrontLeft.setPower(1);
          FrontRight.setPower(1);
          BackLeft.setPower(1);
          BackRight.setPower(1);
        } else if (gamepad1.dpad_down) {
          FrontLeft.setPower(-1);
          FrontRight.setPower(-1);
          BackLeft.setPower(-1);
          BackRight.setPower(-1);
        } else {
          FrontLeft.setPower(0);
          FrontRight.setPower(0);
          BackLeft.setPower(0);
          BackRight.setPower(0);
        }
        if (gamepad1.right_bumper) {
          FrontLeft.setPower(1);
          FrontRight.setPower(-1);
          BackLeft.setPower(-1);
          BackRight.setPower(1);
        } else if (gamepad1.left_bumper) {
          FrontLeft.setPower(-1);
          FrontRight.setPower(1);
          BackLeft.setPower(1);
          BackRight.setPower(-1);
        } else {
          FrontLeft.setPower(0);
          FrontRight.setPower(0);
          BackLeft.setPower(0);
          BackRight.setPower(0);
        }
        if (gamepad1.right_stick_x > 0) {
          FrontLeft.setPower(0.5);
          FrontRight.setPower(-0.5);
          BackLeft.setPower(0.5);
          BackRight.setPower(-0.5);
        } else if (gamepad1.right_stick_x < 0) {
          FrontLeft.setPower(-0.5);
          FrontRight.setPower(0.5);
          BackLeft.setPower(-0.5);
          BackRight.setPower(0.5);
        } else {
          FrontLeft.setPower(0);
          FrontRight.setPower(0);
          BackLeft.setPower(0);
          BackRight.setPower(0);
        }
        if (gamepad2.a) {
          Spinner.setPower(1);
        } else if (gamepad2.y) {
          Spinner.setPower(-1);
        } else {
          Spinner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
          Spinner.setPower(0);
        }
        if (gamepad2.right_stick_x > 0) {
          Armswivel.setPower(-0.5);
        } else if (gamepad2.right_stick_x < 0) {
          Armswivel.setPower(0.5);
        } else {
          Armswivel.setPower(0);
        }
        if (gamepad2.b) {
          claw.setPosition(0);
        }
        if (gamepad2.x) {
          claw.setPosition(0.5);
        }
        if (gamepad2.dpad_up) {
          Arm.setPower(-1);
        } else if (gamepad2.dpad_down) {
          Arm.setPower(1);
        } else {
          Arm.setPower(0);
        }
        while (touchsensor.isPressed()) {
          if (gamepad2.dpad_up) {
            Arm.setPower(0);
          } else if (gamepad2.dpad_down) {
            Arm.setPower(1);
          } else {
            Arm.setPower(0);
          }
        }
      }
    }
  }
}
