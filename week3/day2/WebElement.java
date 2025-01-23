package week3.day2;

public class WebElement {
	
	public void click()
	{
		System.out.println ("Button is Clicked");
	}
	
	public void setText(String text)
	{
		System.out.println ("Text is Entered");
	}

} // WebElement Class Closed

    class Button extends WebElement
    {
    	public void submit()
    	{
    		System.out.println ("Button is Submitted");
    	}
    }
    	
    class TextField extends WebElement
   	{
    	public String getText()
    	{
    		return "Text from TextField";
    	}
    	
   }
  
    class CheckBoxButton extends Button
    {
    	public void clickCheckButton()
    	{
    		System.out.println("Clicked on CheckBoxButton");
    	}
    }
   	 
    class RadioButton extends Button
    {
    	public void selectRadioButton()
    	{
    		System.out.println("Selected on RadioButton");
    	}
     }	
    
    class Elements
    {
    	public static void main(String[] args) {
    		Button button = new Button();
    		button.click();
    		button.submit();
    		
    		TextField tfield = new TextField();
    		tfield.setText("Inheritance");
    		System.out.println("Text from TextField: " + tfield.getText());
    		
    		CheckBoxButton cBox = new CheckBoxButton();
    		cBox.clickCheckButton();
    		
    		RadioButton rButton = new RadioButton();
    		rButton.click();
    		rButton.selectRadioButton();
    	 }
      }
