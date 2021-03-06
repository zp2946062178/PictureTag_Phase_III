package com.bl;

import com.enums.ProjectType;

/**
 * @Author:zhangping
 * @Description:
 * @CreateData: 2018/6/17 21:09
 */
public class Constant {
    public static int PictureNumPerGroup=3;
    public static int MinimalNumToDivide=0;

    public static ProjectType[] Types={
            ProjectType.ANIMALTAG,
            ProjectType.SCENETAG,
            ProjectType.PERSONTAG,
            ProjectType.GOODSTAG,
            ProjectType.OTHERSTAG
    };

    public static String[] GongXian={"0-20%",
            "20%-40%",
            "40%-60%",
            "60%-80%",
            "80-100%"
    };

    public static int MinimalContractPeople=10;

    public static double RemainTimeToRemind=0.6;
}
