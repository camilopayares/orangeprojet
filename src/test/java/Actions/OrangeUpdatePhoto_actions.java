<<<<<<< HEAD
package Actions;

import org.openqa.selenium.WebDriver;

import Elements.OrangeUpdatePhoto_elements;
import Steps.Common_steps;

public class OrangeUpdatePhoto_actions {
	private WebDriver driver;
	
	OrangeUpdatePhoto_elements orangeUpdatePhoto_elements;
	
	public OrangeUpdatePhoto_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeUpdatePhoto_elements = new OrangeUpdatePhoto_elements(driver);
	}
	
	public void	clickOnPhoto() {
		orangeUpdatePhoto_elements.empPicture.click();
	}
	
	public void	enterPhotoFile() {
		//Entrer le chemin sous se trouve la photo suivi du nom de la Photo - ex ici : Profil_Photo.png
		orangeUpdatePhoto_elements.photofile.sendKeys("C:\\Users\\Camilo\\Desktop\\Profil_Photo.png");
	}
	
	public void clickOnUpload() {
		orangeUpdatePhoto_elements.btnUploap.click();
	}
}
=======
package Actions;

import org.openqa.selenium.WebDriver;

import Elements.OrangeUpdatePhoto_elements;
import Steps.Common_steps;

public class OrangeUpdatePhoto_actions {
	private WebDriver driver;
	
	OrangeUpdatePhoto_elements orangeUpdatePhoto_elements;
	
	public OrangeUpdatePhoto_actions(Common_steps cs) {
		this.driver = cs.getDriver();
		orangeUpdatePhoto_elements = new OrangeUpdatePhoto_elements(driver);
	}
	
	public void	clickOnPhoto() {
		orangeUpdatePhoto_elements.empPicture.click();
	}
	
	public void	enterPhotoFile() {
		//Entrer le chemin sous se trouve la photo suivi du nom de la Photo - ex ici : Profil_Photo.png
		orangeUpdatePhoto_elements.photofile.sendKeys("C:\\Users\\Camilo\\Desktop\\Profil_Photo.png");
	}
	
	public void clickOnUpload() {
		orangeUpdatePhoto_elements.btnUploap.click();
	}
}
>>>>>>> branch 'master' of https://github.com/camilopayares/orangeprojet.git
