package pageUIs.user;

public class BaseElementUI {
	public static final String NOPCOMMERCE_LOGO = "xpath=//div[@class='header-logo']//img";
	public static final String UPLOAD_FILE_TYPE = "css=input[type='file']";
	public static final String DYNAMIC_HEADER_LINK_BY_NAME = "xpath=//div[@class='header-links']//a[contains(string(),'%s')]";
	public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_ERROR_MSG_BY_ID = "id=%s-error";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "css=input[id='%s']";
}
