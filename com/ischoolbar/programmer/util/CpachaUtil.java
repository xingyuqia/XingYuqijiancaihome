package com.ischoolbar.programmer.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
<<<<<<< HEAD
 * éªŒè¯ç ç”Ÿæˆå™¨
 * 
 * @author llq
=======
 * ÑéÖ¤ÂëÉú³ÉÆ÷
 * 
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 */
public class CpachaUtil {
	
	/**
<<<<<<< HEAD
	 * éªŒè¯ç æ¥æº
=======
	 * ÑéÖ¤ÂëÀ´Ô´
>>>>>>> å»ºæä¹‹å®¶
	 */
	final private char[] code = {
		'2', '3', '4', '5', '6', '7', '8', '9',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 
		'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
		'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R',
		'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	};
	/**
<<<<<<< HEAD
	 * å­—ä½“
	 */
	final private String[] fontNames = new String[]{
			"é»‘ä½“", "å®‹ä½“", "Courier", "Arial", 
			"Verdana", "Times", "Tahoma", "Georgia"};
	/**
	 * å­—ä½“æ ·å¼
=======
	 * ×ÖÌå
	 */
	final private String[] fontNames = new String[]{
			"ºÚÌå", "ËÎÌå", "Courier", "Arial", 
			"Verdana", "Times", "Tahoma", "Georgia"};
	/**
	 * ×ÖÌåÑùÊ½
>>>>>>> å»ºæä¹‹å®¶
	 */
	final private int[] fontStyles = new int[]{
			Font.BOLD, Font.ITALIC|Font.BOLD
	};
	
	/**
<<<<<<< HEAD
	 * éªŒè¯ç é•¿åº¦
	 * é»˜è®¤4ä¸ªå­—ç¬¦
	 */
	private int vcodeLen = 4;
	/**
	 * éªŒè¯ç å›¾ç‰‡å­—ä½“å¤§å°
	 * é»˜è®¤17
	 */
	private int fontsize = 21;
	/**
	 * éªŒè¯ç å›¾ç‰‡å®½åº¦
	 */
	private int width = (fontsize+1)*vcodeLen+10;
	/**
	 * éªŒè¯ç å›¾ç‰‡é«˜åº¦
	 */
	private int height = fontsize+12;
	/**
	 * å¹²æ‰°çº¿æ¡æ•°
	 * é»˜è®¤3æ¡
=======
	 * ÑéÖ¤Âë³¤¶È
	 * Ä¬ÈÏ4¸ö×Ö·û
	 */
	private int vcodeLen = 4;
	/**
	 * ÑéÖ¤ÂëÍ¼Æ¬×ÖÌå´óĞ¡
	 * Ä¬ÈÏ17
	 */
	private int fontsize = 21;
	/**
	 * ÑéÖ¤ÂëÍ¼Æ¬¿í¶È
	 */
	private int width = (fontsize+1)*vcodeLen+10;
	/**
	 * ÑéÖ¤ÂëÍ¼Æ¬¸ß¶È
	 */
	private int height = fontsize+12;
	/**
	 * ¸ÉÈÅÏßÌõÊı
	 * Ä¬ÈÏ3Ìõ
>>>>>>> å»ºæä¹‹å®¶
	 */
	private int disturbline = 3;
	
	
	public CpachaUtil(){}
	
	/**
<<<<<<< HEAD
	 * æŒ‡å®šéªŒè¯ç é•¿åº¦
	 * @param vcodeLen éªŒè¯ç é•¿åº¦
=======
	 * Ö¸¶¨ÑéÖ¤Âë³¤¶È
	 * @param vcodeLen ÑéÖ¤Âë³¤¶È
>>>>>>> å»ºæä¹‹å®¶
	 */
	public CpachaUtil(int vcodeLen) {
		this.vcodeLen = vcodeLen;
		this.width = (fontsize+1)*vcodeLen+10;
	}
	
	/**
<<<<<<< HEAD
	 * æŒ‡å®šéªŒè¯ç é•¿åº¦ã€å›¾ç‰‡å®½åº¦ã€é«˜åº¦
=======
	 * Ö¸¶¨ÑéÖ¤Âë³¤¶È¡¢Í¼Æ¬¿í¶È¡¢¸ß¶È
>>>>>>> å»ºæä¹‹å®¶
	 * @param vcodeLen
	 * @param width
	 * @param height
	 */
	public CpachaUtil(int vcodeLen,int width,int height) {
		this.vcodeLen = vcodeLen;
		this.width = width;
		this.height = height;
	}
	
	/**
<<<<<<< HEAD
	 * ç”ŸæˆéªŒè¯ç å›¾ç‰‡
	 * @param vcode è¦ç”»çš„éªŒè¯ç 
	 * @param drawline æ˜¯å¦ç”»å¹²æ‰°çº¿
	 * @return
	 */
	public BufferedImage generatorVCodeImage(String vcode, boolean drawline){
		//åˆ›å»ºéªŒè¯ç å›¾ç‰‡
		BufferedImage vcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = vcodeImage.getGraphics();
		//å¡«å……èƒŒæ™¯è‰²
=======
	 * Éú³ÉÑéÖ¤ÂëÍ¼Æ¬
	 * @param vcode Òª»­µÄÑéÖ¤Âë
	 * @param drawline ÊÇ·ñ»­¸ÉÈÅÏß
	 * @return
	 */
	public BufferedImage generatorVCodeImage(String vcode, boolean drawline){
		//´´½¨ÑéÖ¤ÂëÍ¼Æ¬
		BufferedImage vcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = vcodeImage.getGraphics();
		//Ìî³ä±³¾°É«
>>>>>>> å»ºæä¹‹å®¶
		g.setColor(new Color(246, 240, 250));
		g.fillRect(0, 0, width, height);
		if(drawline){
			drawDisturbLine(g);
		}
<<<<<<< HEAD
		//ç”¨äºç”Ÿæˆä¼ªéšæœºæ•°
		Random ran = new Random();
		//åœ¨å›¾ç‰‡ä¸Šç”»éªŒè¯ç 
		for(int i = 0;i < vcode.length();i++){
			//è®¾ç½®å­—ä½“
			g.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyles[ran.nextInt(fontStyles.length)], fontsize));
			//éšæœºç”Ÿæˆé¢œè‰²
			g.setColor(getRandomColor());
			//ç”»éªŒè¯ç 
			g.drawString(vcode.charAt(i)+"", i*fontsize+10, fontsize+5);
		}
		//é‡Šæ”¾æ­¤å›¾å½¢çš„ä¸Šä¸‹æ–‡ä»¥åŠå®ƒä½¿ç”¨çš„æ‰€æœ‰ç³»ç»Ÿèµ„æº
=======
		//ÓÃÓÚÉú³ÉÎ±Ëæ»úÊı
		Random ran = new Random();
		//ÔÚÍ¼Æ¬ÉÏ»­ÑéÖ¤Âë
		for(int i = 0;i < vcode.length();i++){
			//ÉèÖÃ×ÖÌå
			g.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyles[ran.nextInt(fontStyles.length)], fontsize));
			//Ëæ»úÉú³ÉÑÕÉ«
			g.setColor(getRandomColor());
			//»­ÑéÖ¤Âë
			g.drawString(vcode.charAt(i)+"", i*fontsize+10, fontsize+5);
		}
		//ÊÍ·Å´ËÍ¼ĞÎµÄÉÏÏÂÎÄÒÔ¼°ËüÊ¹ÓÃµÄËùÓĞÏµÍ³×ÊÔ´
>>>>>>> å»ºæä¹‹å®¶
		g.dispose();
		
		return vcodeImage;
	}
	/**
<<<<<<< HEAD
	 * è·å¾—æ—‹è½¬å­—ä½“çš„éªŒè¯ç å›¾ç‰‡
	 * @param vcode
	 * @param drawline æ˜¯å¦ç”»å¹²æ‰°çº¿
	 * @return
	 */
	public BufferedImage generatorRotateVCodeImage(String vcode, boolean drawline){
		//åˆ›å»ºéªŒè¯ç å›¾ç‰‡
		BufferedImage rotateVcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = rotateVcodeImage.createGraphics();
		//å¡«å……èƒŒæ™¯è‰²
=======
	 * »ñµÃĞı×ª×ÖÌåµÄÑéÖ¤ÂëÍ¼Æ¬
	 * @param vcode
	 * @param drawline ÊÇ·ñ»­¸ÉÈÅÏß
	 * @return
	 */
	public BufferedImage generatorRotateVCodeImage(String vcode, boolean drawline){
		//´´½¨ÑéÖ¤ÂëÍ¼Æ¬
		BufferedImage rotateVcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = rotateVcodeImage.createGraphics();
		//Ìî³ä±³¾°É«
>>>>>>> å»ºæä¹‹å®¶
		g2d.setColor(new Color(246, 240, 250));
		g2d.fillRect(0, 0, width, height);
		if(drawline){
			drawDisturbLine(g2d);
		}
<<<<<<< HEAD
		//åœ¨å›¾ç‰‡ä¸Šç”»éªŒè¯ç 
=======
		//ÔÚÍ¼Æ¬ÉÏ»­ÑéÖ¤Âë
>>>>>>> å»ºæä¹‹å®¶
		for(int i = 0;i < vcode.length();i++){
			BufferedImage rotateImage = getRotateImage(vcode.charAt(i));
			g2d.drawImage(rotateImage, null, (int) (this.height * 0.7) * i, 0);
		}
		g2d.dispose();
		return rotateVcodeImage;
	}
	/**
<<<<<<< HEAD
	 * ç”ŸæˆéªŒè¯ç 
	 * @return éªŒè¯ç 
=======
	 * Éú³ÉÑéÖ¤Âë
	 * @return ÑéÖ¤Âë
>>>>>>> å»ºæä¹‹å®¶
	 */
	public String generatorVCode(){
		int len = code.length;
		Random ran = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < vcodeLen;i++){
			int index = ran.nextInt(len);
			sb.append(code[index]);
		}
		return sb.toString();
	}
	/**
<<<<<<< HEAD
	 * ä¸ºéªŒè¯ç å›¾ç‰‡ç”»ä¸€äº›å¹²æ‰°çº¿
=======
	 * ÎªÑéÖ¤ÂëÍ¼Æ¬»­Ò»Ğ©¸ÉÈÅÏß
>>>>>>> å»ºæä¹‹å®¶
	 * @param g 
	 */
	private void drawDisturbLine(Graphics g){
		Random ran = new Random();
		for(int i = 0;i < disturbline;i++){
			int x1 = ran.nextInt(width);
			int y1 = ran.nextInt(height);
			int x2 = ran.nextInt(width);
			int y2 = ran.nextInt(height);
			g.setColor(getRandomColor());
<<<<<<< HEAD
			//ç”»å¹²æ‰°çº¿
=======
			//»­¸ÉÈÅÏß
>>>>>>> å»ºæä¹‹å®¶
			g.drawLine(x1, y1, x2, y2);
		}
	}
	/**
<<<<<<< HEAD
	 * è·å–ä¸€å¼ æ—‹è½¬çš„å›¾ç‰‡
	 * @param c è¦ç”»çš„å­—ç¬¦
=======
	 * »ñÈ¡Ò»ÕÅĞı×ªµÄÍ¼Æ¬
	 * @param c Òª»­µÄ×Ö·û
>>>>>>> å»ºæä¹‹å®¶
	 * @return
	 */
	private BufferedImage getRotateImage(char c){
		BufferedImage rotateImage = new BufferedImage(height, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = rotateImage.createGraphics();
<<<<<<< HEAD
		//è®¾ç½®é€æ˜åº¦ä¸º0
=======
		//ÉèÖÃÍ¸Ã÷¶ÈÎª0
>>>>>>> å»ºæä¹‹å®¶
		g2d.setColor(new Color(255, 255, 255, 0));
		g2d.fillRect(0, 0, height, height);
		Random ran = new Random();
		g2d.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyles[ran.nextInt(fontStyles.length)], fontsize));
		g2d.setColor(getRandomColor());
		double theta = getTheta();
<<<<<<< HEAD
		//æ—‹è½¬å›¾ç‰‡
=======
		//Ğı×ªÍ¼Æ¬
>>>>>>> å»ºæä¹‹å®¶
		g2d.rotate(theta, height/2, height/2);
		g2d.drawString(Character.toString(c), (height-fontsize)/2, fontsize+5);
		g2d.dispose();
		
		return rotateImage;
	}
	/**
<<<<<<< HEAD
	 * @return è¿”å›ä¸€ä¸ªéšæœºé¢œè‰²
=======
	 * @return ·µ»ØÒ»¸öËæ»úÑÕÉ«
>>>>>>> å»ºæä¹‹å®¶
	 */
	private Color getRandomColor(){
		Random ran = new Random();
		return new Color(ran.nextInt(220), ran.nextInt(220), ran.nextInt(220)); 
	}
	/**
<<<<<<< HEAD
	 * @return è§’åº¦
=======
	 * @return ½Ç¶È
>>>>>>> å»ºæä¹‹å®¶
	 */
	private double getTheta(){
		return ((int) (Math.random()*1000) % 2 == 0 ? -1 : 1)*Math.random();
	}

	/**
<<<<<<< HEAD
	 * @return éªŒè¯ç å­—ç¬¦ä¸ªæ•°
=======
	 * @return ÑéÖ¤Âë×Ö·û¸öÊı
>>>>>>> å»ºæä¹‹å®¶
	 */
	public int getVcodeLen() {
		return vcodeLen;
	}
	/**
<<<<<<< HEAD
	 * è®¾ç½®éªŒè¯ç å­—ç¬¦ä¸ªæ•°
=======
	 * ÉèÖÃÑéÖ¤Âë×Ö·û¸öÊı
>>>>>>> å»ºæä¹‹å®¶
	 * @param vcodeLen
	 */
	public void setVcodeLen(int vcodeLen) {
		this.width = (fontsize+3)*vcodeLen+10;
		this.vcodeLen = vcodeLen;
	}
	/**
<<<<<<< HEAD
	 * @return å­—ä½“å¤§å°
=======
	 * @return ×ÖÌå´óĞ¡
>>>>>>> å»ºæä¹‹å®¶
	 */
	public int getFontsize() {
		return fontsize;
	}
	/**
<<<<<<< HEAD
	 * è®¾ç½®å­—ä½“å¤§å°
=======
	 * ÉèÖÃ×ÖÌå´óĞ¡
>>>>>>> å»ºæä¹‹å®¶
	 * @param fontsize
	 */
	public void setFontsize(int fontsize) {
		this.width = (fontsize+3)*vcodeLen+10;
		this.height = fontsize+15;
		this.fontsize = fontsize;
	}
	/**
<<<<<<< HEAD
	 * @return å›¾ç‰‡å®½åº¦
=======
	 * @return Í¼Æ¬¿í¶È
>>>>>>> å»ºæä¹‹å®¶
	 */
	public int getWidth() {
		return width;
	}
	/**
<<<<<<< HEAD
	 * è®¾ç½®å›¾ç‰‡å®½åº¦
=======
	 * ÉèÖÃÍ¼Æ¬¿í¶È
>>>>>>> å»ºæä¹‹å®¶
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
<<<<<<< HEAD
	 * @return å›¾ç‰‡é«˜åº¦
=======
	 * @return Í¼Æ¬¸ß¶È
>>>>>>> å»ºæä¹‹å®¶
	 */
	public int getHeight() {
		return height;
	}
	/**
<<<<<<< HEAD
	 * è®¾ç½®å›¾ç‰‡é«˜åº¦
=======
	 * ÉèÖÃÍ¼Æ¬¸ß¶È
>>>>>>> å»ºæä¹‹å®¶
	 * @param height 
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
<<<<<<< HEAD
	 * @return å¹²æ‰°çº¿æ¡æ•°
=======
	 * @return ¸ÉÈÅÏßÌõÊı
>>>>>>> å»ºæä¹‹å®¶
	 */
	public int getDisturbline() {
		return disturbline;
	}
	/**
<<<<<<< HEAD
	 * è®¾ç½®å¹²æ‰°çº¿æ¡æ•°
=======
	 * ÉèÖÃ¸ÉÈÅÏßÌõÊı
>>>>>>> å»ºæä¹‹å®¶
	 * @param disturbline
	 */
	public void setDisturbline(int disturbline) {
		this.disturbline = disturbline;
	}
	
}
