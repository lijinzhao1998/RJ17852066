package lijinzhao.day4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
 private TextField tfAnnulInserestRate = new TextField();
 private TextField tfNumberOfYears = new TextField();
 private TextField tfLoanAmout = new TextField();
 private TextField tfMouthlyPayment = new TextField();
 private TextField tfTotalPayment = new TextField();
 private Button btCalculate = new Button("Calculate");


 
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("年利率:"), 0, 0);
		gridPane.add(tfAnnulInserestRate, 1, 0);
		gridPane.add(new Label("年数 :"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("贷款金额  :"), 0, 2);
		gridPane.add(tfLoanAmout, 1, 2);
		gridPane.add(new Label("每月支付 :"), 0, 3);
		gridPane.add(tfMouthlyPayment, 1, 3);
		gridPane.add(new Label("总付款:"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);
		gridPane.setAlignment(Pos.CENTER);
		tfAnnulInserestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BASELINE_RIGHT);
		tfLoanAmout.setAlignment(Pos.BASELINE_RIGHT);
		tfTotalPayment.setAlignment(Pos.BASELINE_RIGHT);
		tfMouthlyPayment.setAlignment(Pos.BASELINE_RIGHT);
		tfMouthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		btCalculate.setOnAction( e  -> calculateLoanPayment());
		
		Scene scene = new Scene(gridPane,400,250);
		primaryStage.setTitle("LoanCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	private void calculateLoanPayment() {
		// TODO 自动生成的方法存根
	double interest = 
			Double.parseDouble(tfAnnulInserestRate.getText());
	int year = Integer.parseInt(tfNumberOfYears.getText());
	double loanAmount =
			Double.parseDouble(tfLoanAmout.getText());
	Loan loan = new Loan(interest,year,loanAmount);
	tfMouthlyPayment.setText(String.format("￥%.2f", loan.getMouthlyPayment()));
	tfTotalPayment.setText(String.format("￥%.2f",loan.getTotalPayment()));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     Application.launch(args);
	}

}
class Loan{
	private double inter;
	private double loan;
	private int year;
	public Loan(double in, int y, double loa) {
		this.inter = in;
		this.year = y;
		this.loan = loa;
		
	}
	double getMouthlyPayment() {
		return (loan*inter*0.01*year+loan)/(12*year);
	}
	double getTotalPayment() {
		return (loan*inter*0.01)*year+loan;
	}
}
