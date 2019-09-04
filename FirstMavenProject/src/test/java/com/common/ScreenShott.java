package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShott {
public static void ScreenS(WebDriver driver,String ss) throws IOException{
	
	TakesScreenshot tkss = (TakesScreenshot)driver;
	File fl = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl, new File(ss+".png"));
	
}
}
