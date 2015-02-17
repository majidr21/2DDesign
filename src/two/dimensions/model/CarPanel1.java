package two.dimensions.model;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;


public class CarPanel1<CarController>
{

	public CarPanel1(CarController baseController)
	{
		// TODO Auto-generated constructor stub
	}


	private CarController baseController;
	@SuppressWarnings("unused")
	private JTable carTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	
	public void CarPanel(CarController baseController)
	{
		this.setBaseController(baseController);
		setBaseLayout(new SpringLayout());
		setTitleLabel(new JLabel("Majids Cars"));
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupTable()
	{
		@SuppressWarnings("unused")
		String[] colNames = {"Cars col 1", "Cars col 2"};
		DefaultTableModel CarModel = new DefaultTableModel ();
		setCarTable(new JTable(CarModel));
	}
		public boolean isCellEditable(int rowIndex, int mColIndex)
		{
			return false;
		}
		



	

	public void setCarTable(JTable carTable)
	{
		this.carTable = carTable;
	}

	public CarController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(CarController baseController)
	{
		this.baseController = baseController;
	}

	public SpringLayout getBaseLayout()
	{
		return baseLayout;
	}

	public void setBaseLayout(SpringLayout baseLayout)
	{
		this.baseLayout = baseLayout;
	}

	public JLabel getTitleLabel()
	{
		return titleLabel;
	}

	public void setTitleLabel(JLabel titleLabel)
	{
		this.titleLabel = titleLabel;
	}
}