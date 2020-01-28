package com.qa.google.config;

public class configuration {
	
	
	// search  page xpath
	public static final String SearchFeild="//*[@name='q']";
	public static final String GoogleSearchBtn="//*[@class='FPdoLc tfB0Bf'] /center/input[1]";
	public static final String ImFeelLuckyBtn="//*[@class='FPdoLc tfB0Bf'] /center/input[2]";
	public static final String SignInBtn="//*[contains(text(),'Sign in')]";
	public static final String searchGmailLogo="//*[@class='gb_Ia gbii']";
	public static final String searchSignout="//a[contains(text(),'Sign out')]";
	public static final String languageArraypath="//*[@id=\"SIvCob\"]/a";
	public static final String languagehindi="//*[@id=\"SIvCob\"]/a[1]";
	
	
	
	
	
	//signin Btn xpath
	public static final String  grid="//*[@title='Google apps']";
	public static final String account="//span[contains(text(),'Account')]";
	public static final String Search="//span[contains(text(),'Search')]";
	public static final String map="//span[contains(text(),'Maps')]";
	public static final String youtube="//span[contains(text(),'YouTube')]";
	public static final String play="//span[contains(text(),'Play')]";
	public static final String news="//span[contains(text(),'News')]";
	public static final String gmail="//span[contains(text(),'Gmail')]";
	public static final String contacts="//span[contains(text(),'Contacts')]";
	public static final String drive="//span[contains(text(),'Drive')]";
	public static final String calender="//span[contains(text(),'Calendar')]";
	public static final String translate="//span[contains(text(),'Translate')]";
	public static final String photos="//span[contains(text(),'Photos')]";
	public static final String shopping="//span[contains(text(),'Shopping')]";
	public static final String duo="//span[contains(text(),'Duo')]";

	//Account page xpath
	public static final String googleAccount="//*[@id=\"sdgBod\"]";
	public static final String SigninAccountBtn="//a[contains(text(),\"Sign in\")]";
	public static final String accountSignInLogo="//*[@class=\"gb_Ia gbii\"]";
	
	public static final String accountSignoutBtn="//a[contains(text(),'Sign out')]";
	
	// map page xpath
	public static final String mapsearch="//*[@id=\"searchboxinput\"]";
	public static final String mapSignIn="//a[contains(text(),'Sign in')]";
	public static final String mapSignLogo="//span[@class=\"gb_Ia gbii\"]";
	public static final String mapsignout="//a[contains(text(),'Sign out')]";
	
	
	//youtube page xpath
	public static final String youtubeSearch="//*[@id='search'][@name='search_query']";
	public static final String youtubeLogo="//a[@id=\"logo\"]";
	public static final String youtubesignin="//*[@id=\"buttons\"]/ytd-button-renderer/a";
	public static final String youtubesignlogo="//*[@id='avatar-btn']";
	public static final String youtubesignout="//*[contains(text(),'Sign out')]";
	
	// play page Xpath
	public static final String playSearch="//input[@name=\"q\"]";
	public static final String playLogo="//a[@title=\"Google Play Logo\"]";
	public static final String playsignin="//a[contains(text(),'Sign in')]";
	public static final String playsignlogo="//span[@class='gb_Ia gbii']";
	public static final String playsignout="//a[contains(text(),'Sign out')]";
	
	//news page xpath
	public static final String newsSerach="//*[@aria-label='Search'][@type='text']";
	public static final String newsLogo="//a[@id='sdgBod']";
	public static final String newssignin="//a[contains(text(),'Sign in')]";
	public static final String newssignlogo="//span[@class='gb_Ia gbii']";
	public static final String newssignout="//a[contains(text(),'Sign out')]";
	
	
	
	// Gmail Page xpath
	public static final String gmailLogo="/html/body/div[1]/div[1]/div[2]";
	public static final String gmailUsername="//*[@id=\"identifierId\"]";
	public static final String usernamenxtBtn="//*[@id=\"identifierNext\"]";
	public static final String gmailPassword="//*[@name=\"password\"]";
	public static final String passwordnxtbtn="//*[@id=\"passwordNext\"]";
	public static final String signin="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a";
	public static final String gmailcheckpath="//a[@title='Gmail']/img";
			
	
	
	
	
	//product page xpath
	
	public static final String  finalmorelink="/html/body/main/div/section[1]/div/div/ul/li/a";
	public static final String  androidautologo="//p[contains(text(),\"Android Auto\")]";
	public static final String  androidoslogo="//p[contains(text(),\"Android OS\")]";
	public static final String  calenderlogo="//p[contains(text(),\"Calendar\")]";
	public static final String  chromelogo="//p[contains(text(),\"Chrome\")]";
	public static final String  contactlogo="//p[contains(text(),\"Contacts\")]";
	public static final String  earthlogo="//p[contains(text(),\"Earth\")]";
	public static final String  financelogo="//p[contains(text(),\"Finance\")]";
	public static final String  formslogo="//p[contains(text(),\"Forms\")]";
	public static final String  gboardlogo="//p[contains(text(),\"Gboard\")]";
	public static final String  messagelogo="//p[contains(text(),\"Message\")]";
	public static final String  playprotectlogo="//p[contains(text(),\"Play Protect\")]";
	public static final String	transaltelogo="//p[contains(text(),\"Translate\")]";
	public static final String  youtubekidslogo="//p[contains(text(),\"YouTube Kids\")]";
	
	
	
	
	// gmail Inbox xpath
	
    public static final String inboxcount="//*[@class='UI']/div/div/div[3]/div/table/tbody";
	public static final String nextbtn="//div[@id=':l2']";
	public static final String counttxt="//div[@id=':8a']/span/span[2]";
	public static final String composebtn="//*[contains(text(),\"Compose\")]";
	public static final String sendto="//*[@id=':go']";
	public static final String subject="//*[@id=':ap']";
	public static final String mailtextbox="//*[@id=':ek']";
	public static final String sendtobtn="//*[@id=':az']";
	public static final String sentmenu="//a[contains(text(),'Sent')]";
	public static final String searchinmail="//input[@name='q']";
	public static final String mailtobeserch="//*[@id=\":af\"]/tbody/tr/td[5]/div[2]/span/span[@email=\"jagtapmahesh01@gmail.com\"]";
	public static final String settingbtn="//*[@id=\":24\"]";
	public static final String setting2btn="//*[@id=\"ms\"]";
	
	public static final String morebtn="//span[@class=\"CJ\" and contains(text(),\"More\")]";
	public static final String newLabelBtn="//a[@class=\"CK\" and text()=\"Create new label\"]";
	public static final String toperform="//*[@id=\":91\"]/div/div[2]";
	public static final String labelname="//*[@id=\":ap.na\"]";
	public static final String labelokbtn="//button[@name='ok']";
	public static final String testingbtn="//span[@class=\"nU \" ]/a[contains(text(),\"Testing\")]";
	
	public static final String signoutgmail="//*[@class=\"gb_Ia gbii\"]";
	public static final String signoutgmailbtn="//a[contains(text(),'Sign out')]";
	
	public static final String onemailinbox="//*[@class='UI']/div/div/div[3]/div/table/tbody/tr[2]/td[2]";
	public static final String labelbtn="//*[@id=\":2n\"]/div[1]";
	public static final String searchinlabel="/html/body/div[34]/div/div[2]/input";
	
	
	// setting page xpath
	public static final String settingtxt="//*[@class=\"dt\"]";
	
}
