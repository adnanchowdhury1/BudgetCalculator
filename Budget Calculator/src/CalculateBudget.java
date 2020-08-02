import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateBudget implements ActionListener {
	
	private static JPanel panel;
	private static JFrame frame;
	
	private static JTextField salary;
	private static JLabel salaryLabel;
	
	private static JTextField emergencyFund;
	private static JLabel emergencyFundLabel;
	
	private static JTextField investments;
	private static JLabel investmentsLabel;
	
	private static JTextField retirement;
	private static JLabel retirementLabel;
	
	private static JTextField food;
	private static JLabel foodLabel;
	
	private static JTextField clothing;
	private static JLabel clothingLabel;
	
	private static JTextField shelter;
	private static JLabel shelterLabel;
	
	private static JTextField household;
	private static JLabel householdLabel;
	
	private static JTextField transportation;
	private static JLabel transportationLabel;
	
	private static JTextField health;
	private static JLabel healthLabel;
	
	private static JTextField studentLoans;
	private static JLabel studentLoansLabel;
	
	private static JTextField personal;
	private static JLabel personalLabel;
	
	private static JTextField miscellaneous;
	private static JLabel miscellaneousLabel;
	
	private static JTextField tuition;
	private static JLabel tuitionLabel;
	
	private static JTextField taxes;
	private static JLabel taxesLabel;
	
	private static JTextField vacation;
	private static JLabel vacationLabel;
	
	private static JTextField other;
	private static JLabel otherLabel;
	
	private static JButton button;
	private static JLabel budget;
	private static JLabel instructions;
	private static JLabel basedOn;
	private static JLabel errorMessage;
	
	

	public static void main(String[] args) {
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		salary = new JTextField(20);
		salary.setBounds(500, 100, 165, 25);
		panel.add(salary);
		
		salaryLabel = new JLabel("YEARLY Before-Tax Income");
		salaryLabel.setBounds(20, 100, 300, 25);
		panel.add(salaryLabel);
		int budgetValue = 0;
		
		
		
		//-----------------------------------------------------------------
		
		emergencyFund = new JTextField(20);
		emergencyFund.setBounds(500, 140, 165, 25);
		panel.add(emergencyFund);
		
		emergencyFundLabel = new JLabel("Emergency Fund Contribution");
		emergencyFundLabel.setBounds(20, 140, 300, 25);
		panel.add(emergencyFundLabel);
		
		
		//-----------------------------------------------------------------
		
		investments = new JTextField(20);
		investments.setBounds(500, 180, 165, 25);
		panel.add(investments);
		
		investmentsLabel = new JLabel("Investments");
		investmentsLabel.setBounds(20, 180, 165, 25);
		panel.add(investmentsLabel);
		
		//-----------------------------------------------------------------
		
		retirement = new JTextField(20);
		retirement.setBounds(500, 220, 165, 25);
		panel.add(retirement);
		
		retirementLabel = new JLabel("Retirement");
		retirementLabel.setBounds(20, 220, 165, 25);
		panel.add(retirementLabel);
		
		//-----------------------------------------------------------------
		
		food = new JTextField(20);
		food.setBounds(500, 260, 165, 25);
		panel.add(food);
		
		foodLabel = new JLabel("Food (groceries, dining out, etc.)");
		foodLabel.setBounds(20, 260, 300, 25);
		panel.add(foodLabel);
		
		//-----------------------------------------------------------------
		
		clothing = new JTextField(20);
		clothing.setBounds(500, 300, 165, 25);
		panel.add(clothing);
		
		clothingLabel = new JLabel("Clothing (jeans, shoes, jewelry, etc.)");
		clothingLabel.setBounds(20, 300, 300, 25);
		panel.add(clothingLabel);
		
		//-----------------------------------------------------------------
		
		shelter = new JTextField(20);
		shelter.setBounds(500, 340, 165, 25);
		panel.add(shelter);
		
		shelterLabel = new JLabel("Shelter (mortgage, rent, taxes, etc.)");
		shelterLabel.setBounds(20, 340, 300, 25);
		panel.add(shelterLabel);
		
		//-----------------------------------------------------------------
		
		household = new JTextField(20);
		household.setBounds(500, 380, 165, 25);
		panel.add(household);
		
		householdLabel = new JLabel("Household (utilities, cell phone, cable, maintenance, etc.)");
		householdLabel.setBounds(20, 380, 400, 25);
		panel.add(householdLabel);
		
		//-----------------------------------------------------------------
		
		transportation = new JTextField(20);
		transportation.setBounds(500, 420, 165, 25);
		panel.add(transportation);
		
		transportationLabel = new JLabel("Transportation (public transport, car payment, insurance, parking, gas, etc.)");
		transportationLabel.setBounds(20, 420, 500, 25);
		panel.add(transportationLabel);
		
		//-----------------------------------------------------------------
		
		health = new JTextField(20);
		health.setBounds(500, 460, 165, 25);
		panel.add(health);
		
		healthLabel = new JLabel("Health (insurance, medications, doctor visits, etc.)");
		healthLabel.setBounds(20, 460, 500, 25);
		panel.add(healthLabel);
		
		//-----------------------------------------------------------------
		
		studentLoans = new JTextField(20);
		studentLoans.setBounds(500, 500, 165, 25);
		panel.add(studentLoans);
		
		studentLoansLabel = new JLabel("Student Loans");
		studentLoansLabel.setBounds(20, 500, 500, 25);
		panel.add(studentLoansLabel);
		
		//-----------------------------------------------------------------
		
		personal = new JTextField(20);
		personal.setBounds(500, 540, 165, 25);
		panel.add(personal);
		
		personalLabel = new JLabel("Personal (gifts, charity, entertainment, hobbies, etc.)");
		personalLabel.setBounds(20, 540, 500, 25);
		panel.add(personalLabel);
		
		//-----------------------------------------------------------------
		
		miscellaneous = new JTextField(20);
		miscellaneous.setBounds(500, 580, 165, 25);
		panel.add(miscellaneous);
		
		miscellaneousLabel = new JLabel("Miscellaneous (magazines, subscriptions, child care, etc.)");
		miscellaneousLabel.setBounds(20, 580, 500, 25);
		panel.add(miscellaneousLabel);
		
		//-----------------------------------------------------------------
		
		tuition = new JTextField(20);
		tuition.setBounds(500, 660, 165, 25);
		panel.add(tuition);
		
		tuitionLabel = new JLabel("YEARLY Tuition");
		tuitionLabel.setBounds(20, 660, 500, 25);
		panel.add(tuitionLabel);
		
		//-----------------------------------------------------------------
		
		taxes = new JTextField(20);
		taxes.setBounds(500, 700, 165, 25);
		panel.add(taxes);
		
		taxesLabel = new JLabel("YEARLY Income Tax");
		taxesLabel.setBounds(20, 700, 500, 25);
		panel.add(taxesLabel);
		
		//-----------------------------------------------------------------
		
		vacation = new JTextField(20);
		vacation.setBounds(500, 740, 165, 25);
		panel.add(vacation);
		
		vacationLabel = new JLabel("YEARLY Vacation Expenses");
		vacationLabel.setBounds(20, 740, 500, 25);
		panel.add(vacationLabel);
		
		//-----------------------------------------------------------------
		
		other = new JTextField(20);
		other.setBounds(500, 780, 165, 25);
		panel.add(other);
		
		otherLabel = new JLabel("Other YEARLY Expenses");
		otherLabel.setBounds(20, 780, 500, 25);
		panel.add(otherLabel);
		
		//-----------------------------------------------------------------
		
		button = new JButton("Calculate");
		button.setBounds(100, 900, 160, 25);
		button.addActionListener(new CalculateBudget());
		panel.add(button);
		
		frame.setVisible(true);
		
		String ans = String.valueOf(budgetValue);
		budget = new JLabel(ans);
		budget.setBounds(500, 900, 165, 25);
		panel.add(budget);
		
		instructions = new JLabel("BUDGET CALCULATOR (Entries are monthly unless otherwise specified)");
		instructions.setBounds(20, 20, 500, 25);
		panel.add(instructions);
		
		basedOn = new JLabel("Based on http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		basedOn.setBounds(20, 60, 900, 25);
		panel.add(basedOn);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
		int budgetValue = 0;
		int salaryValue = Integer.parseInt(salary.getText());
		int emergencyFundValue = Integer.parseInt(emergencyFund.getText());
		int investmentsValue = Integer.parseInt(investments.getText());
		int retirementValue = Integer.parseInt(retirement.getText());
		int foodValue = Integer.parseInt(food.getText());
		int clothingValue = Integer.parseInt(clothing.getText());
		int shelterValue = Integer.parseInt(shelter.getText());
		int householdValue = Integer.parseInt(household.getText());
		int transportationValue = Integer.parseInt(transportation.getText());
		int healthValue = Integer.parseInt(health.getText());
		int studentLoansValue = Integer.parseInt(studentLoans.getText());
		int personalValue = Integer.parseInt(personal.getText());
		int miscellaneousValue = Integer.parseInt(miscellaneous.getText());
		int tuitionValue = Integer.parseInt(tuition.getText());
		int taxesValue = Integer.parseInt(taxes.getText());
		int vacationValue = Integer.parseInt(vacation.getText());
		int otherValue = Integer.parseInt(other.getText());
		
		
		
		
		budgetValue = budgetValue + (salaryValue/12) - emergencyFundValue - investmentsValue - 
				retirementValue - foodValue - clothingValue - shelterValue - householdValue - transportationValue - 
				healthValue - studentLoansValue - personalValue - miscellaneousValue - (tuitionValue/12) - 
				(taxesValue/12) - (vacationValue/12) - (otherValue/12);
		
		budget.setText(String.valueOf(budgetValue));
		
		}
		catch(Exception a){
			System.out.println("Please fill in all fields and enter numeric characters");
			
		}
		
				
		
	}

}
