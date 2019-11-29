package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screensho {
public static void sc(WebDriver driver,String s) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File f=tk.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File(s+".png"));
	
}
}
