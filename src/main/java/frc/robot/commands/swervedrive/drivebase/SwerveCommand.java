package frc.robot.commands.swervedrive.drivebase;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;

public class SwerveCommand extends CommandBase {

  private CommandJoystick joystick;
  private SwerveSubsystem swerve;

  private final double MAX_FWD_SENS = 4;
  private final double MAX_STR_SENS = 4;
  private final double MAX_ROT_SENS = 2;

  public SwerveCommand(SwerveSubsystem drive, CommandJoystick joystick) {
    this.joystick = joystick;
    this.swerve = drive;
    addRequirements(swerve);
  }

  @Override
  public void execute() {

    double forward = joystick.getY() * MAX_FWD_SENS;
    double sideways = joystick.getX() * MAX_STR_SENS;
    double rotation = joystick.getZ() * MAX_ROT_SENS;
    
    }
}
