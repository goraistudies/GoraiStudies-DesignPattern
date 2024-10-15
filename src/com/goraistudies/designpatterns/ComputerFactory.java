package com.goraistudies.designpatterns;

public class ComputerFactory {

    public static Computer getComputerObject (String osType) {

        if (osType.equalsIgnoreCase("mac")) {
            return new MacComputer();
        } else if (osType.equalsIgnoreCase("linux")) {
            return new LinuxComputer();
        } else {
            return new WindowsComputer();
        }

    }
}
