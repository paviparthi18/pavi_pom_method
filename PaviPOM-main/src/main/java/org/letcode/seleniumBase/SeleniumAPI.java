package org.letcode.seleniumBase;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	/**
	 * @author pavi
	 * @description : launch the chrome browser
	 */
	void setUp(String url);

	/**
	 * @author : pavi
	 * @description : launch the chrome browser with incoginto
	 */
	void setUpWithIncoginto(String url);

	/**
	 * @author : pavi
	 * @description : launch the different browser
	 */
	void setUp(Browser browserName, String url);

	/**
	 * @author : pavi
	 * @description : launch only the url
	 */
	void set(String url);

	/**
	 * @author : pavi
	 * @description : different locators to pass then get the result
	 */
	WebElement element(Locators type, String value);

	/**
	 * @author : pavi
	 * @description : findelements to access the locators
	 */
	List<WebElement> elements(Locators type, String value);

	/**
	 * @author : pavi
	 * @description : selenium in click function
	 */
	void click(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in submit function
	 */
	void submit(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in right click function
	 */
	void rightClick(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in action to click function
	 */
	void Actions(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in sendkeys function
	 */
	void type(WebElement ele, String testData);

	/**
	 * @author : pavi
	 * @description : append text type with selenium sendkeys function
	 */
	void appendText(WebElement ele, String testData);

	/**
	 * @author : pavi
	 * @description : selenium in sendkeys with keys function
	 */
	void typeWithKey(WebElement ele, String testData, Keys keys);

	/**
	 * @author : pavi
	 * @description : selenium in keys function use of sendkeys
	 */
	void keys(WebElement ele, Keys keys);

	/**
	 * @author : pavi
	 * @description : selenium in active element to sendkeys function
	 */
	void activeToType(WebElement ele, String testData);

	/**
	 * @author : pavi
	 * @description : selenium in active element to sendkeys with keys function
	 */
	void activeWithKey(WebElement ele, String testData, Keys keys);

	/**
	 * @author : pavi
	 * @description : selenium in select by value(dropdown) function
	 */
	void selectValue(WebElement ele, String value);

	/**
	 * @author : pavi
	 * @description : selenium in select by text(dropdown) function
	 */
	void selectText(WebElement ele, String value);

	/**
	 * @author : pavi
	 * @description : selenium in index position(dropdown) function
	 */
	void selectIndex(WebElement ele, int position);

	/**
	 * @author : pavi
	 * @description : selenium in window handles function
	 */
	void switchToWindow(int i);

	/**
	 * @author : pavi
	 * @description : selenium in drag & drop with element function
	 */
	void dragAndDrop(WebElement ele, WebElement ele2);

	/**
	 * @author : pavi
	 * @description : selenium in drag & drop with points function
	 */
	void dragAndDropWithPoint(WebElement ele, int a, int b);

	/**
	 * @author : pavi
	 * @description : selenium in get title function
	 */
	String getTitle();

	/**
	 * @author : pavi
	 * @description : selenium in get URL function
	 */
	String getURL();

	/**
	 * @author : pavi
	 * @description : selenium in get text function
	 */
	String getText(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in get attribute function
	 */
	String getAttribute(WebElement ele, String type);

	/**
	 * @author : pavi
	 * @description : selenium in isDisplay function
	 */
	boolean isDisplayed(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in isSelected function
	 */
	boolean isSelected(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in isEnabled function
	 */
	boolean isEnabled(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in alert accept function
	 */
	void alertAccept();

	/**
	 * @author : pavi
	 * @description : selenium in alert dismiss function
	 */
	void alertDismiss();

	/**
	 * @author : pavi
	 * @description : selenium in alert get text function
	 */
	String alertGetText();

	/**
	 * @author : pavi
	 * @description : selenium in alert type(sendkeys) function
	 */
	void alertType(String testData);

	/**
	 * @author : pavi
	 * @description : selenium in switch frame function
	 */
	void switchToFrame(int i);

	/**
	 * @author : pavi
	 * @description : selenium in switch default function
	 */
	void switchToDefault();

	/**
	 * @author : pavi
	 * @description : selenium in point(x,y) use element function
	 */
	void getLocationpoints(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in find the element height, width and point(x,y)
	 *              function
	 */
	void getHeightWidth(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in element of the color value function
	 */
	String getColor(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in mouseover use of action function
	 */
	void mouseover(WebElement ele);

	/**
	 * @author : pavi
	 * @description : selenium in browser close function
	 */
	void close();

	/**
	 * @author : pavi
	 * @description : selenium in broser quit function
	 */
	void quit();

	/**
	 * @author pavi
	 * @description : selenium in navigate of forward funcation
	 */
	void forward();

	/**
	 * @author : pavi
	 * @description : selenium in navigate of back funcation
	 */
	void back();

	/**
	 * @author : pavi
	 * @description : selenium in navigate To function
	 */
	void navigateto(String url);

	/**
	 * @author : pavi
	 * @description : selenium in navigate of refresh function
	 */
	void refresh();

	/**
	 * @author : pavi
	 * @description : page up use(action) function
	 */
	void pageUp();

	/**
	 * @author : pavi
	 * @description : page down use(action) function
	 */
	void pageDown();

	/**
	 * @author : pavi
	 * @description : pariticular element screenshot function
	 */
	void getScreenshotAsElement(WebElement ele, String dst);

	/**
	 * @author : pavi
	 * @description : page screenshot function
	 */
	void driverGetScreenshotAsPage(String dst);

	/**
	 * @author : pavi
	 * @description : page with scroll down screenshot function
	 */
	void driverGetScreenshotAsFullPage(String dst);

	/**
	 * @author : pavi
	 * @description : selenium in javascript executor with date function
	 */
	void date(String script, WebElement ele, String date);

}
