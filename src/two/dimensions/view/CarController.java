package two.dimensions.view;

import javax.swing.JOptionPane;

import two.dimensions.model.Cars;

@SuppressWarnings("unused")
public class CarController
{
	private Cars[][] myCars;
	private CarFrame appFrame;
	
	public CarController()
	{
		myCars = new Cars[3][2];
		fillMyCarsArray();
		appFrame = new CarFrame(this);
	}

	
	private void fillMyCarsArray()
	{
		for(int row = 0; row < myCars.length; row ++)
		{
			for(int col = myCars[row].length-1; col >= 0; col--)
			{
				String name = row + col + "Cars";
				int speed = (int) (Math.random() * 10);
				boolean isFast = (speed %2 == 0);
				myCars[row][col] = new Cars ();
			}
		}
	
		
	}
	public void start()
	{
		
	}
}
