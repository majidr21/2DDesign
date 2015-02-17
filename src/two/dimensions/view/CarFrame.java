package two.dimensions.view;

import javax.swing.JFrame;

import two.dimensions.model.CarPanel1;


public class CarFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CarPanel1<CarController> appPanel;
	
	@SuppressWarnings({ "unchecked", "hiding" })
	public <CarController> CarFrame(CarController baseController)
	{
		setAppPanel1((CarPanel1<two.dimensions.view.CarController>) new CarPanel1<CarController>(baseController));
	}
private void setAppPanel1(CarPanel1<two.dimensions.view.CarController> carPanel1)
	{
		// TODO Auto-generated method stub
		
	}
public CarPanel1<CarController> getAppPanel()
	{
		return appPanel;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setAppPanel(CarPanel1<CarController> appPanel)
	{
		this.appPanel = appPanel;
		Object baseController = null;
		appPanel = new CarPanel1(baseController);
		setupFrame();
		
	}
private void setupFrame()
{
	this.setSize(500, 500);
	this.setContentPane(appPanel);
	this.setVisible(true);

	
	}
private void setContentPane(CarPanel1<two.dimensions.view.CarController> appPanel2)
{

}
{

}
}