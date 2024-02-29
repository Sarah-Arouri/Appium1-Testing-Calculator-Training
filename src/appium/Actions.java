package appium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends Parameters {
	public void addTowNums(String num1, String num2) {
		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num2)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}

	public void subTowNums(String num1, String num2) {
		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num2)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}

	public void mulTowNums(String num1, String num2) {
		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num2)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}

	public void sqrtNumber(String num1) {
		driver.findElement(By.id("com.google.android.calculator:id/op_sqrt")).click();

		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}
			driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		}
	}

	public void powTowNums(String num1, String num2) {
		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num2)) {
				Keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}

	public void factorialNumber(String num1) {
		List<WebElement> Keys = driver.findElements(By.className("android.widget.ImageButton"));
		for (int i = 0; i < Keys.size(); i++) {
			String resourceId = Keys.get(i).getAttribute("resource-id");
			if (resourceId != null && resourceId.contains(num1)) {
				Keys.get(i).click();
				break;
			}

		}
		driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}

	public void ClearingData() {
		driver.findElement(By.id("com.google.android.calculator:id/clr")).click();

	}
}
